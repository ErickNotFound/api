package org.serratec.veiculos.controller;

import java.util.List;
import java.util.Optional;

import org.serratec.veiculos.domain.Veiculo;
import org.serratec.veiculos.repository.VeiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

	@Autowired
	private VeiculosRepository veiculosRepository;

	@GetMapping
	public List<Veiculo> listar() {
		return veiculosRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Veiculo> buscarId(@PathVariable Integer id) {
		Optional<Veiculo> veiculo = veiculosRepository.findById(id);
		if (veiculo.isPresent()) {
			return ResponseEntity.ok(veiculo.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Veiculo inserir(@RequestBody Veiculo veiculo) {
		return veiculosRepository.save(veiculo);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable Integer id) {
		if (veiculosRepository.existsById(id)) {
			veiculosRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Veiculo> atualizar(@RequestBody Veiculo veiculo, @PathVariable Integer id) {
		if (!veiculosRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		veiculo = veiculosRepository.save(veiculo);
		return ResponseEntity.ok(veiculo);
	}

}

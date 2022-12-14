package org.serratec.olamundo.controller;

import java.util.ArrayList;
import java.util.List;

import org.serratec.olamundo.domain.Veiculo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
	private static List<Veiculo> veiculos = new ArrayList<>();
	static {
		veiculos.add(new Veiculo(1, "Ford", "Focus"));
		veiculos.add(new Veiculo(2, "Mitsubishi", "Lancer"));
		veiculos.add(new Veiculo(3, "Volvo", "Xc60"));
		veiculos.add(new Veiculo(4, "Nissan", "GT-R"));
	}

	@GetMapping
	public List<Veiculo> listar() {
		return veiculos;
	}

	@GetMapping("/{id}")
	public Veiculo buscar(@PathVariable Integer id) {
		for (int i = 0; i < veiculos.size(); i++) {
			if (veiculos.get(i).getId().equals(id)) {
				return veiculos.get(i);
			}
		}
		return null;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Veiculo inserir(@RequestBody Veiculo veiculo) {
		veiculos.add(veiculo);
		return veiculo;
	}
}

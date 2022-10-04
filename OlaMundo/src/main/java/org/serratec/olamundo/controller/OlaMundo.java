package org.serratec.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OlaMundo {
	@GetMapping("/ola")
	public String olaMundo() {
		return "Oi Sumida! rs";
	}
	@GetMapping("/resposta")
	public String resposta() {
		return "aaaaaaaaaa";
	}
	@GetMapping("/maiuscula")
	public String maiuscula(@RequestParam String texto, @RequestParam String nome) {
		return texto.toUpperCase() + " - " + nome.toUpperCase();
	}
	@GetMapping("/soma")
	public Integer soma(@RequestParam Integer n1, @RequestParam Integer n2){
		return (n1 + n2);
	}
	@GetMapping("/multiplicar")
	public Integer multiplicar(@RequestParam Integer n1, @RequestParam Integer n2){
		return (n1 * n2);
	}
	@GetMapping("/subtrair")
	public Integer subtrair(@RequestParam Integer n1, @RequestParam Integer n2){
		return (n1 - n2);
	}
	@GetMapping("/dividir")
	public Integer dividir(@RequestParam Integer n1, @RequestParam Integer n2){
		return (n1 / n2);
	}
}

package org.serratec.olamundo.controller;

import java.util.ArrayList;
import java.util.List;

import org.serratec.olamundo.domain.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	private static List<Aluno> alunos = new ArrayList<>();
	static {
		alunos.add(new Aluno(1l, "Gabriel", "21212324"));
		alunos.add(new Aluno(2l, "Lucas", "2235345234"));
		alunos.add(new Aluno(3l, "João", "22534254"));
		alunos.add(new Aluno(4l, "Marcos", "2176786824"));
	}
	
	@GetMapping
	public List<Aluno> listar(){
		return alunos;
	}
}

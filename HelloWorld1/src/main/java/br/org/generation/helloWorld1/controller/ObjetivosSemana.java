package br.org.generation.helloWorld1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ex03")

public class ObjetivosSemana {
	
	@GetMapping
	
	public String objetivos() {
		return "Iniciamos com Banco de dados Sql"
				+ "\n ";
	}

}

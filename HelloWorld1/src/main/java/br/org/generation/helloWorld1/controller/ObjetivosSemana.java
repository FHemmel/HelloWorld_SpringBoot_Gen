package br.org.generation.helloWorld1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/Ex03")

public class ObjetivosSemana {
	
	@GetMapping
	
	public ArrayList<String> objetivos() {
		
		ArrayList<String> objetivos = new ArrayList<>();
		
		objetivos.add("Iniciamos aprendendo MySQL.");
		objetivos.add("Fizemos lista de exercício.");
		objetivos.add("Entregamos o DER do nosso blog pessoal.");
		objetivos.add("BSM e Canvas.");
		objetivos.add("Iniciamos com SpringBoot");
		objetivos.add("Entregamos o DER do nosso projeto integrador.");
		objetivos.add("Fizemos um exercício do SpringBoot.");
		
		return objetivos;
	}

}

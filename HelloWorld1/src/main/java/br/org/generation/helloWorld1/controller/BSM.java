/* Ex02 - O segundo endpoint deverá exibir a lista de BSM’s da Generation Brasil. */

package br.org.generation.helloWorld1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Ex02")

public class BSM {

	@GetMapping
	
		public String bsm() {
		
		
		return "lista de BSM’s da Generation Brasil:\n"
				+ "Introdução às Habilidades Comportamentais e Mentalidades\n"
				+ "Mentalidade de Crescimento\n"
				+ "Persistência\n"
				+ "Responsabilidade Pessoal \n"
				+ "Orientação ao Futuro\n"
				+ "Comunicação\n"
				+ "Orientação ao Detalhe\n"
				+ "Proatividade\n"
				+ "Trabalho em Equipe\n"
				+ "Dar e Receber\n"
				+ "Gestão do Tempo\n"
				+ "Maximizar a Aprendizagem Online e o Trabalho Remoto";
	}
}

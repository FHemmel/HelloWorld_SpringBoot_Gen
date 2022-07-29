/* Ex02 - O segundo endpoint deverá exibir a lista de BSM’s da Generation Brasil. */

package br.org.generation.helloWorld1.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Ex02")

public class BSM {

	@GetMapping
	
		public ArrayList<String> bsm() {
		
		ArrayList<String> listaBsm = new ArrayList<>();
		
		listaBsm.add("------ Lista de BSM’s da Generation Brasil: ------");
		listaBsm.add("Introdução às Habilidades Comportamentais e Mentalidades");
		listaBsm.add("Mentalidade de Crescimento");
		listaBsm.add("Persistência");
		listaBsm.add("Responsabilidade Pessoal");
		listaBsm.add("Orientação ao Futuro");
		listaBsm.add("Comunicação");
		listaBsm.add("Orientação ao Detalhe");
		listaBsm.add("Orientação ao Detalhe");
		listaBsm.add("Proatividade");
		listaBsm.add("Trabalho em Equipe");
		listaBsm.add("Dar e Receber");
		listaBsm.add("Gestão do Tempo");
		listaBsm.add("Maximizar a Aprendizagem Online e o Trabalho Remoto");
				
				
		return listaBsm;
	}
}

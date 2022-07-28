/* Atividade prática – Desenvolvendo o Backend com Spring 
 * 		Crie um projeto Spring que possua 3 endpoints:
  			Ex01- O primeiro endpoint deverá exibir a mensagem: Hello World! */
 

package br.org.generation.helloWorld1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ex01")

public class HelloWorld1 {

	@GetMapping
	
	public String hello() {
		return "Hello World!";
	}
	
}

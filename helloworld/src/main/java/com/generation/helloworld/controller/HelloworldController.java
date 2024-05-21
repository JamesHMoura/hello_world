package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloworldController {
	@GetMapping
	public String ola() {
		return "olá mundo!!!";
	}
	@GetMapping("objetivos")
	public String objetivos() {
		return "-Aprefeiçoar meu inglês ainda mais\n-Aprender mais sobre API e desenvolvimento web\n"
				+ "-Revisar CV, Pitch pessoas e Linkedin\n-Aperfeiçoar uma soft skill";
	}
	@GetMapping("bsm")
	public String bsm() {
		return "BSM'S GENERATION!!\n"
				+ "-Persistência\n-Orientação ao Futuro\n-Mentalidade de Crescimento\n-Responsabilidade Pessoal";
	}
	
	@GetMapping("comida")
	public String comidas() {
		return "LANCHONETE GENERATION\n"
				+ "Hamburgão por --- R$15.90\nPizza Palmito por R$ 39.50\nCoca Latão por -- R$5.60";
		
	}
	
}

package br.com.bruno.gerencia.lojista.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loja")
public class LojaController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

}

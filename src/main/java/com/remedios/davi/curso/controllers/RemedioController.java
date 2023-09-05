package com.remedios.davi.curso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.davi.curso.remedio.DadosCadastroRemedio;
import com.remedios.davi.curso.remedio.Remedio;
import com.remedios.davi.curso.remedio.RemedioRepository;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
	
	@Autowired
	private RemedioRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroRemedio dados) {
		repository.save(new Remedio(dados));
	}
}

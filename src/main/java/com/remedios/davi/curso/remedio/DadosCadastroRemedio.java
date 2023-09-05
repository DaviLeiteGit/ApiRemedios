package com.remedios.davi.curso.remedio;

public record DadosCadastroRemedio(
		String nome, 
		Via via, 
		String quantidade,
		String validade,
		String lote,
		Laboratorio laboratorio) {
	
}

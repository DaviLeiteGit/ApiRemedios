package com.remedios.davi.curso.remedio;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table (name = "Remedio") // essa classe vai ser representada no banco que ela é uma tabela
@Entity(name = "remedios")//essa classe é uma entidade
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Data
public class Remedio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//identifica que o banco vai estar gerando o id automaticamente
	private long id;
	private String nome; 
	
	@Enumerated(EnumType.STRING)//quer dizer que o tipo do atributo é um enum e tem que ser mapeado pelo jpa
	private Via via; 
	private String quantidade;
	private String validade;
	private String lote;
	
	@Enumerated(EnumType.STRING)
	private Laboratorio laboratorio;

	public Remedio(DadosCadastroRemedio dados) {
		this.nome = dados.nome();
		this.via = dados.via();
		this.quantidade = dados.quantidade();
		this.lote = dados.lote();
		this.validade = dados.validade();
		this.laboratorio = dados.laboratorio();
		
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}
}

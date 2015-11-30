package br.feso.asluiz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	private String codigo;
	
	@ManyToOne
	private Editora editora;
	
	/**
	 * @deprected Apenas para o uso dos frameworks. 
	 * 
	 */
	@Deprecated
	public Livro() {}

	public Livro(String nome, String codigo, Editora editora) {
		this.nome = nome;
		this.codigo = codigo;
		this.editora = editora;
	}

	public String getNome() {
		return nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public Editora getEditora() {
		return editora;
	}
	
}

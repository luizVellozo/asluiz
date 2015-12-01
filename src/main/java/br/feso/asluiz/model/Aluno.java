package br.feso.asluiz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno implements Usuario {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	private String matricula;
	/**
	 * @deprected Apenas para o uso dos frameworks. 
	 * 
	 */
	@Deprecated
	public Aluno() {}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}
}

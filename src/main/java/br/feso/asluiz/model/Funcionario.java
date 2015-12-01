package br.feso.asluiz.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario implements Usuario {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	private String cpf;
	
	@Enumerated(EnumType.STRING)
	private Perfil perfil;
	
	/**
	 * @deprected Apenas para o uso dos frameworks. 
	 * 
	 */
	@Deprecated
	public Funcionario() {}
	
	public Funcionario(String nome, String cpf, Perfil perfil) {
		this.nome = nome;
		this.cpf = cpf;
		this.perfil = perfil;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
}

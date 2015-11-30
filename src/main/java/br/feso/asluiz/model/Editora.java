package br.feso.asluiz.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Editora {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	
	@OneToMany(mappedBy="editora")
	private List<Livro> livros;
	/**
	 * @deprected Apenas para o uso dos frameworks. 
	 * 
	 */
	@Deprecated
	public Editora() {}

	public Editora(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Livro> getLivros() {
		return livros;
	}
}

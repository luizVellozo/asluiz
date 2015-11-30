package br.feso.asluiz.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Emprestimo {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	private Livro livro;

	private LocalDate dataDeEntrega;
	
	@ManyToOne
	private Funcionario funcionario;
	
	@ManyToOne
	private Aluno aluno;

	public Emprestimo(Livro livro) {
		this.livro = livro;
	}
	
	/**
	 * @deprected Apenas para o uso dos frameworks. 
	 * 
	 */
	@Deprecated
	public Emprestimo() {}

	public void setDataDeEntrega(LocalDate dataDeEntrega) {
		this.dataDeEntrega = dataDeEntrega;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LocalDate getDataDeEntrega() {
		return dataDeEntrega;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Aluno getAluno() {
		return aluno;
	}
}

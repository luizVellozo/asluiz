package br.feso.asluiz.controller;

import java.time.LocalDate;

import br.feso.asluiz.model.Aluno;
import br.feso.asluiz.model.Emprestimo;
import br.feso.asluiz.model.Funcionario;
import br.feso.asluiz.model.Livro;

public class EmprestimoBuilder {
	
	private Emprestimo emprestimoAconstruir;
	
	public EmprestimoBuilder(Livro livro){
		emprestimoAconstruir = new Emprestimo(livro);
	}
	
	public EmprestimoBuilder naData(LocalDate data){
		
		return this;
	}
	
	public EmprestimoBuilder para(Aluno aluno){
		return this;
	}
	
	public EmprestimoBuilder de(Funcionario funcionario){
		return this;
	}
	
	public Emprestimo constroi(){
		return emprestimoAconstruir;
	}
	

}

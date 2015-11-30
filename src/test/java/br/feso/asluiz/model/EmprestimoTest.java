package br.feso.asluiz.model;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class EmprestimoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void criaEmprestimoComSets() {
		
		Aluno aluno = new Aluno("Luiz","1115");
		Funcionario funcionario = new Funcionario("Fernanda","0012",Perfil.FUNCIONARIO);
		
		Editora editora = new Editora("Casadocodigo");
		Livro livro = new Livro("DDD","1115",editora);
		
		Emprestimo emprestimo = new Emprestimo(livro);
		emprestimo.setDataDeEntrega(LocalDate.of(2015, 12, 23));
		emprestimo.setFuncionario(funcionario);
		emprestimo.setAluno(aluno);
		
		assertEquals(emprestimo.getAluno(),aluno);
		assertEquals(emprestimo.getFuncionario(),funcionario);
		assertEquals(emprestimo.getLivro(),livro);
	}
	
}

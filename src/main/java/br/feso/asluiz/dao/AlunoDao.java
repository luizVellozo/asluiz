package br.feso.asluiz.dao;

import java.util.ArrayList;
import java.util.List;

import br.feso.asluiz.model.Aluno;

public class AlunoDao {
	
private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public AlunoDao() {
		Aluno a = new Aluno("Luiz", "111526");
		Aluno b = new Aluno("Mariana", "111526");
		Aluno c = new Aluno("Fernando", "111236");
		alunos.add(a);
		alunos.add(b);
		alunos.add(c);
		
	}

	public List<Aluno> getAll() {
		return alunos;
	}

}

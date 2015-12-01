package br.feso.asluiz.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.feso.asluiz.model.Aluno;
import br.feso.asluiz.model.Livro;

public class AlunoDao {

	private EntityManager em;

	@Deprecated
	public AlunoDao() {}

	@Inject
	public AlunoDao(EntityManager em) {
		this.em = em;
	}

	public List<Aluno> getAll() {
		return em.createQuery("select a from Aluno a").getResultList();

	}

	public void salva(Aluno aluno) {
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
	}
}

package br.feso.asluiz.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.feso.asluiz.model.Livro;

public class LivroDao {
	
	private EntityManager em;
	
	@Deprecated
	public LivroDao() {}
	
	@Inject
	public LivroDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Livro> getAll() {
		return em.createQuery("select l from Livro l").getResultList();
		
	}
	
	public void salva(Livro livro) {
		em.getTransaction().begin();
		em.persist(livro);
		em.getTransaction().commit();
	}
}

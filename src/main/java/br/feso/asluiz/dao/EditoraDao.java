package br.feso.asluiz.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.feso.asluiz.model.Editora;

public class EditoraDao {
	
	private EntityManager em;
	
	@Deprecated
	public EditoraDao() {}
	
	@Inject
	public EditoraDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Editora> getAll() {
		return em.createQuery("select e from Editora e").getResultList();
		
	}
	
	public void salva(Editora editora) {
		em.getTransaction().begin();
		em.persist(editora);
		em.getTransaction().commit();
	}
}

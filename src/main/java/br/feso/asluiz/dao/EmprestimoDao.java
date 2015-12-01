package br.feso.asluiz.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.feso.asluiz.model.Emprestimo;

public class EmprestimoDao {
	
	private EntityManager em;
	
	@Deprecated
	public EmprestimoDao() {}
	
	@Inject
	public EmprestimoDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Emprestimo> getAll() {
		return em.createQuery("select e from Emprestimo e").getResultList();
		
	}
	
	public void salva(Emprestimo emprestimo) {
		em.getTransaction().begin();
		em.persist(emprestimo);
		em.getTransaction().commit();
	}
}

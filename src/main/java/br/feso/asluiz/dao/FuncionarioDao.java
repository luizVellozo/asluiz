package br.feso.asluiz.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.feso.asluiz.model.Funcionario;

public class FuncionarioDao {

	private EntityManager em;

	@Deprecated
	public FuncionarioDao() {}

	@Inject
	public FuncionarioDao(EntityManager em) {
		this.em = em;
	}

	public List<Funcionario> getAll() {
		return em.createQuery("select f from Funcionario f").getResultList();

	}

	public void salva(Funcionario funcionario) {
		em.getTransaction().begin();
		em.persist(funcionario);
		em.getTransaction().commit();
	}

}

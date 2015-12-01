package br.feso.asluiz.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.feso.asluiz.dao.AlunoDao;
import br.feso.asluiz.dao.EmprestimoDao;
import br.feso.asluiz.dao.FuncionarioDao;
import br.feso.asluiz.dao.LivroDao;
import br.feso.asluiz.model.Emprestimo;

@Controller
public class EmprestimoController {

	private AlunoDao alunoDao;
	private FuncionarioDao funcionarioDao;
	private Result result;
	private LivroDao livroDao;
	private EmprestimoDao emprestimoDao;

	@Inject
	public EmprestimoController(Result result, EmprestimoDao emprestimoDao, AlunoDao alunoDao, FuncionarioDao funcionarioDao, LivroDao livroDao) {
		this.alunoDao = alunoDao;
		this.funcionarioDao = funcionarioDao;
		this.result = result;
		this.livroDao = livroDao;
		this.emprestimoDao = emprestimoDao;
	}

	@Deprecated
	public EmprestimoController() {
	}

	@Get
	public void novo() {
		result.include("alunoList", alunoDao.getAll());
		result.include("funcionarioList", funcionarioDao.getAll());
		result.include("livroList", livroDao.getAll());
	}

	@Get
	public List<Emprestimo> lista() {
		return emprestimoDao.getAll();
	}

	@Post
	public void cadastra(Emprestimo emprestimo) {
		System.out.println(emprestimo.getFuncionario().getNome());
		emprestimoDao.salva(emprestimo);
		result.redirectTo(this).lista();
	}
}

package br.feso.asluiz.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.feso.asluiz.dao.AlunoDao;
import br.feso.asluiz.dao.FuncionarioDao;
import br.feso.asluiz.model.Aluno;
import br.feso.asluiz.model.Funcionario;
import br.feso.asluiz.model.Perfil;

@Controller
public class UsuarioController {
	
	private AlunoDao alunoDao;
	private FuncionarioDao funcionarioDao;
	private Result result;

	@Inject
	public UsuarioController(AlunoDao alunoDao, FuncionarioDao funcionarioDao, Result result){
		this.alunoDao = alunoDao;
		this.funcionarioDao = funcionarioDao;
		this.result = result;
	}
	
	@Deprecated
	public UsuarioController() {}
	
	@Get
	public void novoAluno() {}
	
	@Get
	public void novoFuncionario() {
		result.include("perfis",Perfil.values());
	}
	
	@Get
	public void lista() {
		result.include("alunoList",alunoDao.getAll());
		result.include("funcionarioList",funcionarioDao.getAll());
	}
	
	@Post
	public void cadastraAluno(Aluno aluno) {
		alunoDao.salva(aluno);
		result.redirectTo(this).lista();
	}
	
	@Post
	public void cadastraFuncionario(Funcionario funcionario) {
		funcionarioDao.salva(funcionario);
		result.redirectTo(this).lista();
	}
}

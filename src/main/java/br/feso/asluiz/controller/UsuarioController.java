package br.feso.asluiz.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.feso.asluiz.dao.AlunoDao;
import br.feso.asluiz.dao.FuncionarioDao;

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
	public void novo() {}
	
	@Get
	public void lista() {
		result.include("alunoList",alunoDao.getAll());
	}
}

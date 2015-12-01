package br.feso.asluiz.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.feso.asluiz.dao.EditoraDao;
import br.feso.asluiz.dao.LivroDao;
import br.feso.asluiz.model.Livro;

@Controller
public class LivroController {
	
	private Result result;
	private LivroDao livroDao;
	
	@Inject
	public LivroController(Result result, LivroDao livroDao) {
		this.result = result;
		this.livroDao = livroDao;
		
	}

	@Deprecated
	public LivroController() {
		this(null, null);
	}
	
	@Get
	public void novo() {}
	
	@Get
	public List<Livro> lista() {
		return livroDao.getAll();
	}
	
}

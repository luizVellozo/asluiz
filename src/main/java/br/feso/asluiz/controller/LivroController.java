package br.feso.asluiz.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.feso.asluiz.dao.EditoraDao;
import br.feso.asluiz.dao.LivroDao;
import br.feso.asluiz.model.Editora;
import br.feso.asluiz.model.Livro;

@Controller
public class LivroController {
	
	private Result result;
	private LivroDao livroDao;
	private EditoraDao editoraDao;
	
	@Inject
	public LivroController(Result result, LivroDao livroDao, EditoraDao editoraDao) {
		this.result = result;
		this.livroDao = livroDao;
		this.editoraDao = editoraDao;
		
	}

	@Deprecated
	public LivroController() {}
	
	@Get
	public List<Editora> novo() {
		return editoraDao.getAll();
	}
	
	@Get
	public List<Livro> lista() {
		return livroDao.getAll();
	}
	
	@Post
	public void cadastra(Livro livro) {
		livroDao.salva(livro);
		result.redirectTo(this).lista();
	}
	
}

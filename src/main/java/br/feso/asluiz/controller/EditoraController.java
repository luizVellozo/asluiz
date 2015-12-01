package br.feso.asluiz.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.feso.asluiz.dao.EditoraDao;
import br.feso.asluiz.model.Editora;

@Controller
public class EditoraController {
	
	private Result result;
	private EditoraDao editoraDao;
	
	@Inject
	public EditoraController(Result result, EditoraDao editoraDao) {
		this.result = result;
		this.editoraDao = editoraDao;
		
	}

	@Deprecated
	public EditoraController() {
		this(null, null);
	}
	
	@Get
	public void novo() {}
	
	@Get
	public List<Editora> lista() {
		return editoraDao.getAll();
	}
	
}

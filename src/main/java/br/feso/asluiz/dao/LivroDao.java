package br.feso.asluiz.dao;

import java.util.ArrayList;
import java.util.List;

import br.feso.asluiz.model.Editora;
import br.feso.asluiz.model.Livro;

public class LivroDao {
	
	private List<Livro> livros = new ArrayList<Livro>();
	
	public LivroDao() {
		Editora editoraA = new Editora("AAA");
		Livro livroA = new Livro("AAA","22210",editoraA);
		Livro livroB = new Livro("BBB","42210",editoraA);
		Livro livroC = new Livro("CCC","22321",editoraA);
		livros.add(livroA);
		livros.add(livroB);
		livros.add(livroC);
	}
	
	public List<Livro> getAll() {
		return livros;
	}
}

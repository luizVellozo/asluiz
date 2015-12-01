package br.feso.asluiz.dao;

import java.util.ArrayList;
import java.util.List;

import br.feso.asluiz.model.Editora;

public class EditoraDao {
	
	private List<Editora> editoras = new ArrayList<Editora>();
	
	public EditoraDao() {
		Editora editoraA = new Editora("AAA");
		Editora editoraB = new Editora("BBB");
		Editora editoraC = new Editora("CCC");
		editoras.add(editoraA);
		editoras.add(editoraB);
		editoras.add(editoraC);
	}
	
	public List<Editora> getAll() {
		return editoras;
	}
	
	public void salva(Editora editora) {
		editoras.add(editora);
	}
}

package br.feso.asluiz.model;

public enum Perfil {
	FUNCIONARIO("Funcionário"),
	GERENTE("Gerente");
	
	private final String label;
	
	Perfil(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

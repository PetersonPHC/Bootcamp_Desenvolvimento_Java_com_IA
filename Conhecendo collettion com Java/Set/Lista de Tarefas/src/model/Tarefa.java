package model;

public class Tarefa {

	private String descricao;
	private boolean concluida;

	// Construtores
	public Tarefa() {
		super();
	}

	public Tarefa(String descricao, boolean concluida) {
		super();
		this.descricao = descricao;
		this.concluida = concluida;
	}

	// Getters e Setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String toString() {
		return "Tarefa {descrição: " + descricao + " Concluida: " + concluida + "}";
	}

}

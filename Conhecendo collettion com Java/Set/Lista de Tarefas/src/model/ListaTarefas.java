package model;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefa> listaTarefas = new HashSet<>();

	public void adicionarTarefa(String descricao) {
		listaTarefas.add(new Tarefa(descricao, false));
	}

	public void removerTarefa(String descricao) {
		boolean encontrada = false;
		// : Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
		for (Tarefa tarefa : listaTarefas) {
			if (tarefa.getDescricao() == descricao) {
				listaTarefas.remove(tarefa);
				encontrada = true;
				break;
			}
		}
		if (!encontrada) {
			System.out.println("Tarefa Não Encontrada");
		}
	}

	public void exibirTarefas() {
		System.out.println(listaTarefas);
	}

	public int contarTarefas() {
		return listaTarefas.size();
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<Tarefa>();
		for (Tarefa tarefa : listaTarefas) {
			if (tarefa.isConcluida()) {
				tarefasConcluidas.add(tarefa);
			}
		}
		return tarefasConcluidas;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<Tarefa>();
		for (Tarefa tarefa : listaTarefas) {
			if (!tarefa.isConcluida()) {
				tarefasPendentes.add(tarefa);
			}
		}
		return tarefasPendentes;
	}

	public void marcarTarefaConcluida(String descricao) {
		boolean encontrada = false;
		for (Tarefa tarefa : listaTarefas) {
			if (tarefa.getDescricao() == descricao) {
				tarefa.setConcluida(true);
				encontrada = true;
			}
		}
		if (!encontrada) {
			System.out.println("Tarefa Não Encontrada");
		}
	}

	public void marcarTarefaPendente(String descricao) {
		boolean encontrada = false;
		for (Tarefa tarefa : listaTarefas) {
			if (tarefa.getDescricao() == descricao) {
				tarefa.setConcluida(false);
				encontrada = true;
			}
		}
		if (!encontrada) {
			System.out.println("Tarefa Não Encontrada");
		}
	}

	public void limparListaTarefas() {
		listaTarefas.clear();
		System.out.println("Tarefas Excluidas Com Sucesso!");
	}

}

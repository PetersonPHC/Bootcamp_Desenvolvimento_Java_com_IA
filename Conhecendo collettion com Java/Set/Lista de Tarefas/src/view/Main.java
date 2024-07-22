package view;

import model.ListaTarefas;

public class Main {

	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();

		// Testes das operações da classe "ListaTarefas"
		listaTarefas.adicionarTarefa("Tarefa 1");
		listaTarefas.adicionarTarefa("Tarefa 2");
		listaTarefas.adicionarTarefa("Tarefa 3");
		listaTarefas.adicionarTarefa("Tarefa 4");
		listaTarefas.adicionarTarefa("Tarefa 5");
		listaTarefas.adicionarTarefa("Tarefa 7");

		listaTarefas.exibirTarefas();

		listaTarefas.removerTarefa("Tarefa 7");
		listaTarefas.adicionarTarefa("Tarefa 6");
		listaTarefas.exibirTarefas();

		System.out.println("Total de Tarefas: " + listaTarefas.contarTarefas());
		listaTarefas.marcarTarefaConcluida("Tarefa 7");
		listaTarefas.marcarTarefaPendente("Tarefa 7");

		System.out.println();
		listaTarefas.marcarTarefaConcluida("Tarefa 2");
		listaTarefas.marcarTarefaConcluida("Tarefa 4");
		listaTarefas.marcarTarefaConcluida("Tarefa 6");
		listaTarefas.marcarTarefaConcluida("Tarefa 1");

		System.out.println(listaTarefas.obterTarefasConcluidas());
		System.out.println(listaTarefas.obterTarefasPendentes());

		listaTarefas.removerTarefa("Tarefa 6");

		System.out.println();
		listaTarefas.exibirTarefas();
		System.out.println("Total de Tarefas: " + listaTarefas.contarTarefas());
		
		listaTarefas.limparListaTarefas();
		System.out.println("Total de Tarefas: " + listaTarefas.contarTarefas());
	}

}

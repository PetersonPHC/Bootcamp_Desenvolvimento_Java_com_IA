package view;

import model.GerenciarAlunos;

public class Main {
	public static void main(String[] args) {
		GerenciarAlunos gerenciarAlunos = new GerenciarAlunos(); 
	
		gerenciarAlunos.adicionarAluno("Aluno 1", (long) 11111, 10);
		gerenciarAlunos.adicionarAluno("Aluno 2", (long) 22222, 7.5);
		gerenciarAlunos.adicionarAluno("Aluno 3", (long) 33333, 8);
		gerenciarAlunos.adicionarAluno("Aluno 4", (long) 44444, 9.5);
		gerenciarAlunos.adicionarAluno("Aluno 5", (long) 55555, 5);
		gerenciarAlunos.exibirAlunos();
		
		gerenciarAlunos.exibirAlunosPorNome();
		gerenciarAlunos.exibirAlunosPorNota();
		
		gerenciarAlunos.removerAluno(22222);
		gerenciarAlunos.removerAluno(55555);
		
		gerenciarAlunos.exibirAlunos();
		
	}

}

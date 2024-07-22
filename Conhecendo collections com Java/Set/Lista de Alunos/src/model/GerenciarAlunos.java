package model;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAlunos {
	Set<Aluno> listaAlunos = new HashSet<>();

	public void adicionarAluno(String nome, Long matricula, double nota) {
		listaAlunos.add(new Aluno(nome, matricula, nota));
	}

	public void removerAluno(long matricula) {
		boolean encontrado = false;
		for (Aluno aluno : listaAlunos) {
			if (aluno.getMatricula() == matricula) {
				listaAlunos.remove(aluno);
				System.out.println("Aluno Removido");
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Aluno Não Encontrado");
		}
	}

	public void exibirAlunosPorNome() {
		// inserindo dados(aqui os dados são organizados automaticamente através do
		// Comparable da classe Aluno)
		Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
		System.out.println(alunosPorNome);
	}

	public void exibirAlunosPorNota() {
		// como organizar
		Set<Aluno> alunosPorNota = new TreeSet<>(new AlunosPorNota());
		// inserindo dados
		alunosPorNota.addAll(listaAlunos);
		System.out.println(alunosPorNota);
	}

	public void exibirAlunos() {
		System.out.println(listaAlunos);
	}

}

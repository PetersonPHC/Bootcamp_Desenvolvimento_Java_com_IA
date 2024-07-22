package model;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private long matricula;
	private double nota;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, long matricula, double nota) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Aluno aluno = (Aluno) obj;
		return getMatricula() == aluno.getMatricula();
	}

	@Override
	public String toString() {
		return "Aluno {Nome: " + nome + ", Matricula: " + matricula + ", Nota: " + nota + "}";
	}

	@Override
	public int compareTo(Aluno aluno) {
		return nome.compareToIgnoreCase(aluno.getNome());
	}
	
	
}

class AlunosPorNota implements Comparator<Aluno>{

	@Override
	public int compare(Aluno aluno1, Aluno aluno2) {
		return Double.compare(aluno1.getNota(), aluno2.getNota());
	}
	
}
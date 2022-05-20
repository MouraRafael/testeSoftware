package br.com.escola.model.entidade;

public class Aluno {
	private long id;
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getNota1() {
		return nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public double getNota3() {
		return nota3;
	}
	
	
	
	
	
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	
}

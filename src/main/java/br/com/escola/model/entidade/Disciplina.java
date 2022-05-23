package br.com.escola.model.entidade;

public class Disciplina {
	private long id;
	private String nome;
	private int cargaHoraria;
	
	
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	
	
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
}

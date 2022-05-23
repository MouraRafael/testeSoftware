package br.com.escola.controller;

import java.util.ArrayList;

import br.com.escola.model.dao.AlunoDao;
import br.com.escola.model.entidade.Aluno;

public class AlunoController {
	public ArrayList<Aluno> listar(String nome){
		AlunoDao dao = new AlunoDao();
		
		return dao.listar(nome);
	}
	
	
	public String alterar(Aluno a) {
		AlunoDao dao = new AlunoDao();
		return dao.alterar(a);
	}
	
	public String excluir (int i) {
		AlunoDao dao = new  AlunoDao();
		
		return dao.excluir(i);
	}
}

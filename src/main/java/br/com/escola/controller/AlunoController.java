package br.com.escola.controller;

import java.util.ArrayList;

import br.com.escola.model.dao.AlunoDao;
import br.com.escola.model.entidade.Aluno;

public class AlunoController {
	public ArrayList<Aluno> listar(String nome){
		AlunoDao dao = new AlunoDao();
		
		return dao.listar(nome);
	}
}

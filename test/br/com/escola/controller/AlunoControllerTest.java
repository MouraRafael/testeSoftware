package br.com.escola.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.escola.controller.AlunoController;
import br.com.escola.model.dao.AlunoDao;
import br.com.escola.model.entidade.Aluno;

class AlunoControllerTest {

	@Test
	void test() {
		AlunoController controller = new AlunoController();
		ArrayList<Aluno> lista = controller.listar("sss");
		assertTrue(lista.size() == 0);
	}
	@Test
	@DisplayName("Teste Alteracao  Controller")
	void testaltera() {
		AlunoController controller = new AlunoController();
		
		Aluno aluno = new Aluno();
		AlunoDao dao = new AlunoDao();
		
		aluno.setId(1);
		aluno.setNome("Pedro Paulo");
		aluno.setNota1(9);
		aluno.setNota3(9);
		aluno.setNota2(9);
		
		assertEquals("falha em alterar",controller.alterar(aluno));
		assertEquals("alterado com sucesso",controller.alterar(aluno));
		
	}
	
	
	@Test
	@DisplayName("Teste Deletar Controller")
	void testExlusao() {
		AlunoController  controller = new AlunoController();
		
		//assertEquals("Erro ao excluir", controller.excluir(4));
		assertEquals("Excluído com Sucesso", controller.excluir(4));
	}

}

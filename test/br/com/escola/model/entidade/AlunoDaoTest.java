package br.com.escola.model.entidade;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.escola.model.dao.AlunoDao;



class AlunoDaoTest {

	@Test
	@DisplayName("Teste lista")
	void test() {
		AlunoDao dao = new AlunoDao();
		
		ArrayList<Aluno> lista = dao.listar("");
		
		
		
		//assertEquals(2, lista.size());
		assertTrue(lista.size()>1);
	}
	
	@Test
	void testListaComParametro() {
		AlunoDao dao = new AlunoDao();
		
		ArrayList<Aluno> lista = dao.listar("a");
		
		assertTrue(lista.size()>0);
		
	}
	
	@Test
	@Disabled
	void testInclusao(){
		AlunoDao dao = new AlunoDao();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Felipe");
		aluno.setNota1(9);
		
		assertEquals("Cadastrado com sucesso", dao.incluir(aluno));
	}
	
	@Test
	void testInclusaoSemNome() {
		AlunoDao dao = new AlunoDao();
		Aluno aluno = new Aluno();
		
		aluno.setNota1(10);
		aluno.setNota2(10);
		aluno.setNota3(10);
		
		assertEquals("Erro no cadastro",dao.incluir(aluno));
		
	}
	
	@Test
	@DisplayName("Teste Deletar")
	void testExlusao() {
		AlunoDao dao = new AlunoDao();
		
		assertEquals("Excluído com Sucesso", dao.excluir(4));
	}
	
	
	@Test
	@DisplayName("Alteracao Aluno")
	void testAlterar() {
		Aluno aluno = new Aluno();
		AlunoDao dao = new AlunoDao();
		
		aluno.setId(1);
		aluno.setNome("Pedro Paulo");
		aluno.setNota1(9);
		aluno.setNota3(9);
		aluno.setNota2(9);
		
		assertEquals("alterado com sucesso",dao.alterar(aluno));
		
	}
	
	@Test
	@DisplayName("Teste para avergiguar busca pro id")
	void testBuscaid() {
		Aluno 		a 	= new Aluno();
		Aluno 		b 	= new Aluno();
		AlunoDao 	dao = new AlunoDao();
		
		a.setId(1);
		
		b.setId(1);
		b.setNome("Pedro Paulo");
		b.setNota1(9);
		b.setNota2(9);
		b.setNota3(9);
		assertAll(
			()->assertEquals(b.getId()		,dao.buscarPorId(a.getId()).getId()),
			()->assertEquals(b.getNome()	,dao.buscarPorId(a.getId()).getNome()),
			()->assertEquals(b.getNota1()	,dao.buscarPorId(a.getId()).getNota1()),
			()->assertEquals(b.getNota2()	,dao.buscarPorId(a.getId()).getNota2()),
			()->assertEquals(b.getNota3()	,dao.buscarPorId(a.getId()).getNota3())
		);
		
	}
	
	

}

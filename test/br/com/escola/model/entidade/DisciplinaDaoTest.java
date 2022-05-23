package br.com.escola.model.entidade;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.escola.model.dao.DisciplinaDao;

class DisciplinaDaoTest {

	@Test
	@DisplayName("Teste Sem Parâmetro")
	void testList() {
		DisciplinaDao dao = new DisciplinaDao();
		ArrayList<Disciplina> lista = dao.listar("");
		
		assertTrue(lista.size()>1);
	}
	
	@Test
	@DisplayName("Teste Com Parâmetro")
	void testListaParam() {
		DisciplinaDao dao = new DisciplinaDao();
		ArrayList<Disciplina> lista = dao.listar("u");
		
		assertTrue(lista.size()>0);
	}

}

package br.com.escola.model.entidade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AlunoTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("Teste Assert")
	void teste1() {
		assertEquals(1,1);
	}
	
	@Test
	@DisplayName("Teste Aluno")
	void testAluno() {
		Aluno a = new Aluno();
		a.setNome("Luís");
		
		assertEquals("Luís", a.getNome());
		
	}

}

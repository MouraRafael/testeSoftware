package br.com.escola.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.com.escola.controller.AlunoController;
import br.com.escola.model.entidade.Aluno;

class AlunoControllerTest {

	@Test
	void test() {
		AlunoController controller = new AlunoController();
		ArrayList<Aluno> lista = controller.listar("sss");
		assertTrue(lista.size() == 0);
	}

}

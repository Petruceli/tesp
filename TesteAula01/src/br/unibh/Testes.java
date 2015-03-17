package br.unibh;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.entidades.Aluno;
import br.unibh.persistencia.AlunoDAO;

public class Testes {

	@Test
	public void testeBuscarAluno(){
		
		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find(1L);
		Assert.assertEquals(a.getCpf(), "12345678999");
	}

	@Test
	public void testeInsertAluno(){
		
		AlunoDAO dao = new AlunoDAO();
		Aluno a = new Aluno(null, 12321L, "Tómaz Gonzaga",
				"34234342", new Date());
		dao.insert(a);
		Aluno a2 = dao.find(4L);
		Assert.assertEquals(a2.getCpf(), "34234342");
		
	}
}

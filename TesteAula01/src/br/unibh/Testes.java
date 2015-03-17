package br.unibh;

import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.unibh.entidades.Aluno;
import br.unibh.persistencia.AlunoDAO;

public class Testes {

	@Before
	public void preparaBanco(){
		AlunoDAO dao = new AlunoDAO();
		Aluno a1 = new Aluno(null, new Long(1234), "João", "987987987", new Date());
		Aluno a2 = new Aluno(null, new Long(34544), "Maria", "345345345", new Date());
		Aluno a3 = new Aluno(null, new Long(23423), "Renata", "767676767", new Date());
		dao.insert(a1);
		dao.insert(a2);
		dao.insert(a3);
	}
	
	@After
	public void limpaBanco(){
		AlunoDAO dao = new AlunoDAO();
		dao.clean();
	}
	
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

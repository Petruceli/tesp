package br.unibh;

import java.math.BigDecimal;
import java.util.Date;

import br.unibh.entidades.Aluno;
import br.unibh.entidades.Professor;

public class AloMundo {

	public static void main(String[] args) {

		// for (int i = 0; i < 10; i++) {
		/*
		 * int i = 0; while (i < 10) { System.out.println(i + 1 +
		 * " Aló Mundo!"); i++; }
		 */

		Aluno a1 = new Aluno(1L, 1234L, "João", "987987987", new Date());
		Aluno a2 = new Aluno(2L, 5678L, "Maria", "345345345", new Date());
		Aluno a3 = new Aluno(3L, 8566L, "Renata", "767676767");
		Aluno a4 = new Aluno(4L, 9900L, "Gustavo");
		Professor p1 = new Professor(5L, "José", "123123123",
				new BigDecimal(123456));
		Professor p2 = new Professor(6L, "Luiz", "765765765");
		
		System.out.println("Bonus ====== " + Professor.BONUS);
		System.out.println("Matrícula é " + Aluno.verificaMatricula("1111111111111"));
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(p1);
		System.out.println(p2);

	}
}

package br.unibh;

import java.math.BigDecimal;
import java.util.Date;

public class AloMundo {

	public static void main(String[] args) {

		// for (int i = 0; i < 10; i++) {
		/*
		 * int i = 0; while (i < 10) { System.out.println(i + 1 +
		 * " Aló Mundo!"); i++; }
		 */

		Aluno a1 = new Aluno(1234L, "João", "987987987", new Date());
		Aluno a2 = new Aluno(5678L, "Maria", "345345345");
		Aluno a3 = new Aluno(8566L, "Renata");
		Professor p1 = new Professor("José", "123123123",
				new BigDecimal(123456));
		Professor p2 = new Professor("Luiz", "765765765");
		
		System.out.println("Bonus ====== " + Professor.BONUS);
		System.out.println("Matrícula é " + Aluno.verificaMatricula("1111111111111"));
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(p1);
		System.out.println(p2);

	}
}

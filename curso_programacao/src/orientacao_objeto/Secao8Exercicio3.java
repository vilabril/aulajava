package orientacao_objeto;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;


public class Secao8Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Informe o Nome do Aluno:");
	    aluno.aluno = sc.nextLine();
	    System.out.print("Informe a primeira nota at� 30 pontos:");
	    aluno.notaA = sc.nextDouble();
	    System.out.print("Informe a segunda nota at� 35 pontos:");
	    aluno.notaB = sc.nextDouble();
	    System.out.print("Informe a Terceira nota at� 35 pontos:");
	    aluno.notaC = sc.nextDouble();
	    System.out.println();
	    System.out.println("Resultado:");
	    System.out.println();
	    System.out.println("O aluno " + aluno.aluno + " obteve: " + aluno.TotalNota());
	    System.out.println();
	    System.out.println("Ele " + aluno.Resultado() + " de ano.");
	    System.out.println();
	    if (aluno.Resultado() !="Passou") {
	    	System.out.println("Faltou " + aluno.PontosRestante() + " pontos para ele passar.");
	    }
	    sc.close();
	}

}

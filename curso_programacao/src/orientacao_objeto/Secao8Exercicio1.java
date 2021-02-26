package orientacao_objeto;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Secao8Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Informe o lado A do Retangulo:");
	    retangulo.la = sc.nextDouble();
	    System.out.print("Informe o lado B do Retangulo:");
	    retangulo.lb = sc.nextDouble();
	    System.out.println();
	    System.out.println("A Area do retangulo é:"+retangulo.area());
	    System.out.println("O Perimentro do retangulo é:"+retangulo.perimetro());
	    System.out.println("A diagonal do retangulo é:"+retangulo.diagonal());
	    	
		sc.close();

	}

}

package orientacao_objeto;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Secao8Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Informe o Nome do Funcionário:");
	    funcionario.nome = sc.nextLine();
	    System.out.print("Informe o Salario bruto :");
	    funcionario.salBruto = sc.nextDouble();
	    System.out.print("Informe o imposto :");
	    funcionario.imposto = sc.nextDouble();
	    System.out.println();
	    System.out.println("Resultado:");
	    System.out.println();
	    System.out.printf("O empregado: "+ funcionario.nome + " redeberá liquido: "+ funcionario.SalLiquido());
	    System.out.println();
	    System.out.print("Qual o percentual de aumento do salario ?");
	    double aumento = sc.nextDouble();
	    System.out.println("O empregado: "+ funcionario.nome + " redeberá liquido com aumento: "+funcionario.UpSalario(aumento));
	    System.out.println();	    
	    
	    sc.close();
	}

}

package orientacao_objeto;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaCorrente;

public class Secao9Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaCorrente contacorrente = new ContaCorrente();
		
		System.out.print("Informe o Nome do Correntista:");
	    contacorrente.setCorrentista(sc.nextLine());
	    System.out.print("Informe o numero da conta:");
	    contacorrente.setNumConta(sc.nextInt());
	    sc.nextLine();
	    System.out.println("Deseja realizar um deposito S ou N?");	
	    char resp = sc.next().charAt(0);
	    
	    if (resp !='N') {
		    System.out.print("Informe o valor do deposito:");
		    contacorrente.Deposito(sc.nextDouble());
		    System.out.println();
		    System.out.println("Resultado:");
		    System.out.println();
		    System.out.println("Criada a conta: "+ contacorrente.getNumConta() 
		    					+ " proprietario: "+ contacorrente.getCorrentista()
		    					+ " com saldo de " + contacorrente.getValor());
		    System.out.println();
		    
		    System.out.print("Entre com o valor de deposito: ");
		    contacorrente.Deposito(sc.nextDouble());
		    System.out.println("Saldo atualizado da conta: "+ contacorrente.getNumConta() 
								+ " proprietario :"+ contacorrente.getCorrentista()
								+ " com saldo de " + contacorrente.getValor());
		    System.out.println();
		    
		    System.out.print("Entre com o valor de saque: ");
		    contacorrente.Saque(sc.nextDouble());
		    System.out.println("Saldo atualizado da conta: "+ contacorrente.getNumConta() 
								+ " proprietario :"+ contacorrente.getCorrentista()
								+ " com saldo de " + contacorrente.getValor());
	    }else {
	    	System.out.print("Conta criada com sucesso.");
	    }
		
		sc.close();
	}

}

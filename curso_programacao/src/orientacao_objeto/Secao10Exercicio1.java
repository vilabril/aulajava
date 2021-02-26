package orientacao_objeto;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pensionato;

public class Secao10Exercicio1 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println(" Informe a quantida de quartos alugados: ");
		int n = sc.nextInt();
		Pensionato[] vet = new Pensionato[10];
		
		for (int i=0; i<n; i++) {
			System.out.println(" Informe o locador: ");
			String nome = sc.nextLine();
			System.out.println(" Informe o email do locador: ");
			String email = sc.nextLine();
			System.out.println(" Informe o quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			vet[quarto] = new Pensionato(quarto, nome, email);
		}
		for (int i=0; i<vet.length; i++ ){
			
			if (vet[i] != null) {
				System.out.println("quarto N: "+ vet[i].getNumQuarto()
				+ " Locado para:  "+ vet[i].getLocador()
				+ " com email: " + vet[i].getEmail());
			
			}
			
		}
		
		sc.close();

	}

}

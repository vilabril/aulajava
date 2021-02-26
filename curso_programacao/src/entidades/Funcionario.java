package entidades;

public class Funcionario {
	public String nome;
	public double salBruto;
	public double imposto;
	
	public double SalLiquido() {
		return salBruto - imposto;
	}
	public double UpSalario(double aumento) {
		return (salBruto + (salBruto * (aumento/100))- imposto);
	}
	
	

}

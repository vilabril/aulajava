package entidades;

public class Aluno {
	
	public String aluno;
	public double notaA;
	public double notaB;
	public double notaC;
	
	public double TotalNota() {
		return notaA + notaB + notaC;
	}
	
	public String Resultado() {
		
		if (TotalNota()> 60.00) {
			return "Passou";
		}
		else {
			return "N�o passou";
		}
	}
	
	public double PontosRestante() {
		return 60.00 - TotalNota();
	}

}

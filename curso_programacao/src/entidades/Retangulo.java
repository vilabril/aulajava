package entidades;
/* Calcular area, perimetro e diagonal*/
public class Retangulo {
	public double la;
	public double lb;
	
	public double area() {
		return la*lb;
	}
	
	public double perimetro() {
		return 2*(la+lb);
	}
	
	public double diagonal() {
		double result = Math.sqrt((Math.pow(la,2))+(Math.pow(lb,2)));
		return result;
	}
}

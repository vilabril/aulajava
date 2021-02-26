package entidades;

public class Pensionato {
	private int numQuarto;
	private String locador;
	private String email;
	
	public Pensionato(int numQuarto, String locador, String email) {
		this.numQuarto = numQuarto;
		this.locador = locador;
		this.email = email;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	public String getLocador() {
		return locador;
	}

	public void setLocador(String locador) {
		this.locador = locador;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

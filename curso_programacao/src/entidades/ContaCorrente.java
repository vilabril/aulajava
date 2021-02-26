package entidades;

public class ContaCorrente {

	private int numConta;
	private String correntista;
	private double valor;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int numConta, String correntista, double valor) {
		super();
		this.numConta = numConta;
		this.correntista = correntista;
		this.valor = valor;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void Deposito(double valor) {
		this.valor += valor;
	}
	
	public void Saque(double valor) {
		double taxa = 5.00;
		this.valor -= (valor + taxa);
	}
}

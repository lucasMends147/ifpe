package L10;

public abstract class Conta {
	private String banco;
	private int numConta;
	private double taxa;
	private double saldo;
	
	public Conta(String banco,int numConta,double taxa,double saldo){
		this.banco = banco;
		this.numConta = numConta;
		this.taxa = taxa;
		this.saldo = saldo;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract double sacar(double valor);
	
	public abstract double depositar(double valor);
	

}

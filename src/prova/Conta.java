package prova;

public class Conta {
	private int numero;
	Banco b;
	Cliente c;
	
	public Conta(int numero,Banco b,Cliente c) {
		this.numero = numero;
		this.b = b;
		this.c = c;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Banco getB() {
		return b;
	}

	public void setB(Banco b) {
		this.b = b;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

}

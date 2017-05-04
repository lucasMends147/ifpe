package prova;

public class Cliente {
	private String nome;
	private long cpf;
	private double saldo;
	
	public Cliente(String nome,long cpf,double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

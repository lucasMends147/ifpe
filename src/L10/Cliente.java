package L10;
	//Crie uma tamb�m classe Cliente. A classe Cliente possui:
	//nome, cpf, conta corrente e poupan�a. Crie uma classe Teste que forne�a as
	//seguintes op��es:
	
public class Cliente {
	private String nome;
	private long cpf;
	private ContaCorrente ContaC;
	private ContaPoupanca ContaP;
	
	public Cliente(String nome, long cpf, ContaCorrente contaC, ContaPoupanca contaP) {
		this.nome = nome;
		this.cpf = cpf;
		ContaC = contaC;
		ContaP = contaP;
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

	public ContaCorrente getContaC() {
		return ContaC;
	}

	public void setContaC(ContaCorrente contaC) {
		ContaC = contaC;
	}

	public ContaPoupanca getContaP() {
		return ContaP;
	}

	public void setContaP(ContaPoupanca contaP) {
		ContaP = contaP;
	}
	
	
}

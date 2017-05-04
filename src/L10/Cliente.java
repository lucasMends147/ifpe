package L10;
	//Crie uma também classe Cliente. A classe Cliente possui:
	//nome, cpf, conta corrente e poupança. Crie uma classe Teste que forneça as
	//seguintes opções:
	
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

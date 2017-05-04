package L7;
public class Conta {
	private int numero;
	private int agencia;
	private String nome;
	private double saldo;
	private long cpf;
	
	

	public Conta(int numero, int agencia, String nome, double saldo,long cpf) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
		this.cpf = cpf;
	}
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo(){
		return this.saldo;
		
	}
	public boolean verifica(String nome) {
		if(this.nome.equals(nome)){
			nome = "Saldo é de : " + this.saldo;
			 return true;
		}
		return false;
	}

	
	
	public void deposito(String nome,double valor){
		if(this.nome.equals(nome)){
			this.saldo += valor;
		}
	}
	public void saque(String nome,double valor){
		if(this.nome.equals(nome)){
			this.saldo -= valor;
		}
		
	}
	
	public boolean consulta(String nome){
		String mostra = "";
		if(this.nome.equals(nome)){
			mostra = "Cliente " + this.nome + "\nCPF: " + this.cpf;
			return true;
			
		}
		mostra = "Não consta!";
		return false;
	
	}
	
	
}

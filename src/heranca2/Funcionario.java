package heranca2;
//Exerc�cio 1: Implemente a classe Funcionario e a classe Gerente.
//a. crie a classe Assistente, que tamb�m � um funcion�rio, e que possui um n�mero de
//matr�cula (fa�a o m�todo GET). Sobrescreva o m�todo exibeDados().
//b. sabendo que os Assistentes T�cnicos possuem um b�nus salarial e que os
//Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
//noturno, crie as classes Tecnico e Administrativo.
public class Funcionario {
	private String nome;
	private long cpf;
	private double salario;
	private String endereco;
	
	public Funcionario(String nome,long cpf,double salario,String endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String exibeDados(){
		String tudo = "";
		return tudo = "Nome :  " + this.nome + "\nCPF :  " + this.cpf + "\nSal�rio : " + this.salario
				+ "\nEndere�o : " + this.endereco;
	}
}

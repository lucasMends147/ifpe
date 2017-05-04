package heranca2;
//Exercício 1: Implemente a classe Funcionario e a classe Gerente.
//a. crie a classe Assistente, que também é um funcionário, e que possui um número de
//matrícula (faça o método GET). Sobrescreva o método exibeDados().
//b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
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
		return tudo = "Nome :  " + this.nome + "\nCPF :  " + this.cpf + "\nSalário : " + this.salario
				+ "\nEndereço : " + this.endereco;
	}
}

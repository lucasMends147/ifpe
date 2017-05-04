package L6;
//Questão 01: Escreva um programa que controle os funcionários de uma empresa. É
//necessário saber o nome e o salário desses funcionários. Escreva um método que receba
//uma lista de funcionários e retorne os que recebem mais que R$ 5.000,00. Crie uma
//classe teste que forneça as seguintes opções:
//1. Cadastrar um funcionário
//2. Exibir os funcionários de alta renda
//0. Sair

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome,double salario){
		this.nome = nome;
		this.salario = salario;
		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
		
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public boolean salario(){
		if(this.salario >= 5000.0){
			return true;
		}
		return false;
	}

}

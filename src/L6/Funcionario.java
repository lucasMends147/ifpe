package L6;
//Quest�o 01: Escreva um programa que controle os funcion�rios de uma empresa. �
//necess�rio saber o nome e o sal�rio desses funcion�rios. Escreva um m�todo que receba
//uma lista de funcion�rios e retorne os que recebem mais que R$ 5.000,00. Crie uma
//classe teste que forne�a as seguintes op��es:
//1. Cadastrar um funcion�rio
//2. Exibir os funcion�rios de alta renda
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

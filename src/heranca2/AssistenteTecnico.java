package heranca2;
//Exercício 1: Implemente a classe Funcionario e a classe Gerente.
//a. crie a classe Assistente, que também é um funcionário, e que possui um número de
//matrícula (faça o método GET). Sobrescreva o método exibeDados().
//b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
//Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
//noturno, crie as classes Tecnico e Administrativo.
public class AssistenteTecnico extends Assistente{
	private double bonus = 500;
	
	public AssistenteTecnico(String nome,long cpf,double salario,String endereco,int numMatricula){
		super(nome,cpf,salario,endereco,numMatricula);
	
		
	}
	
	public double salarioBonus(){
		super.setSalario(super.getSalario() + this.bonus);
		return super.getSalario();
	}
}

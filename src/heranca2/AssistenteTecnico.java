package heranca2;
//Exerc�cio 1: Implemente a classe Funcionario e a classe Gerente.
//a. crie a classe Assistente, que tamb�m � um funcion�rio, e que possui um n�mero de
//matr�cula (fa�a o m�todo GET). Sobrescreva o m�todo exibeDados().
//b. sabendo que os Assistentes T�cnicos possuem um b�nus salarial e que os
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

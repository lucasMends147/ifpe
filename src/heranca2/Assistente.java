package heranca2;
//Exercício 1: Implemente a classe Funcionario e a classe Gerente.
//a. crie a classe Assistente, que também é um funcionário, e que possui um número de
//matrícula (faça o método GET). Sobrescreva o método exibeDados().
//b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
//Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
//noturno, crie as classes Tecnico e Administrativo.
public class Assistente extends Funcionario {
	private int numMatricula;
	
	public Assistente(String nome,long cpf,double salario ,String endereco,int numMatricula){
		super(nome,cpf,salario,endereco);
		this.numMatricula = numMatricula;
		
	}
	
	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String exibeDados(){
		String tudo = "";
		return tudo = "Nome :  " + super.getNome() + "\nCPF :  " + super.getCpf() + 
				"\nSalário : " + super.getSalario() + "\nEndereço : " + super.getEndereco() +
				"\nNúmero da matrícula : " + this.numMatricula;
		}
}

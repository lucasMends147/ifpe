package heranca2;
//Exerc�cio 1: Implemente a classe Funcionario e a classe Gerente.
//a. crie a classe Assistente, que tamb�m � um funcion�rio, e que possui um n�mero de
//matr�cula (fa�a o m�todo GET). Sobrescreva o m�todo exibeDados().
//b. sabendo que os Assistentes T�cnicos possuem um b�nus salarial e que os
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
				"\nSal�rio : " + super.getSalario() + "\nEndere�o : " + super.getEndereco() +
				"\nN�mero da matr�cula : " + this.numMatricula;
		}
}

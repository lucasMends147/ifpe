package heranca2;
//Exercício 1: Implemente a classe Funcionario e a classe Gerente.
//a. crie a classe Assistente, que também é um funcionário, e que possui um número de
//matrícula (faça o método GET). Sobrescreva o método exibeDados().
//b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
//Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
//noturno, crie as classes Tecnico e Administrativo.
public class AssistenteAdministrativo extends Assistente {
	private String turno;
	private double adicional;
	
	public AssistenteAdministrativo(String nome,long cpf,double salario,
			String endereco,int numMatricula,String turno,double adicional){
		super(nome,cpf,salario,endereco,numMatricula);
		this.turno = turno;
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void Turno(){
		if(this.turno.equalsIgnoreCase("noturno")){
			super.setSalario(super.getSalario() + this.adicional);
		}
	}
}

package prova;
//) Fa�a um sistema que gerencie as contas e poupan�as de um banco. A classe conta possui:
//n�mero, Banco (n�mero da ag�ncia e nome da ag�ncia), Cliente (nome e CPF) e o saldo. A
//classe Poupan�a possui os mesmos dados da classe com mais o atributo juros e o m�todo.
//render juros. Crie uma classe teste que forne�a as seguintes op��es:

public class ContaPoupanca extends Conta {
	private double juros;
	
	public ContaPoupanca(int numero,Banco b,Cliente c,double juros) {
		super(numero,b,c);
		this.juros = juros;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	public void renderJuros(){
		double aux = super.getC().getSaldo();
		super.getC().setSaldo(((super.getC().getSaldo() * juros/100) + aux ));
		
	}
	
}

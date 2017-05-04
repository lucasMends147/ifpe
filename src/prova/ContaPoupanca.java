package prova;
//) Faça um sistema que gerencie as contas e poupanças de um banco. A classe conta possui:
//número, Banco (número da agência e nome da agência), Cliente (nome e CPF) e o saldo. A
//classe Poupança possui os mesmos dados da classe com mais o atributo juros e o método.
//render juros. Crie uma classe teste que forneça as seguintes opções:

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

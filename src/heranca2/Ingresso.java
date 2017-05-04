package heranca2;

public class Ingresso {
	private double valor = 150;



	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String imprimeValor(){
		return "O valor do ingresso é : " + this.valor;
	}
	
}

package heranca2;

public class VIP extends Ingresso {
	private double adicional = 85;
	
	public VIP() {
		
		super();
	}
	
	public String novoValor(){
		return "O valor do ingresso VIP é de : " + (super.getValor() + adicional);
	}
}

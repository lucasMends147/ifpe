package heranca2;
//c. crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos
//para acessar e imprimir esta localização) e uma classe CamaroteSuperior, que é
//mais cara (possui valor adicional). Esta última possui um método para retornar o
//valor do ingresso. Ambas as classes herdam a classe VIP.
public class CamaroteSuperior extends VIP {
	private double adicional = 35;
	
	public CamaroteSuperior() {
		
		super();
	}

	public double retornaValor(){
		super.setValor(super.getValor() + adicional);
		return super.getValor();
		
	}
}

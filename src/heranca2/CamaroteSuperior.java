package heranca2;
//c. crie uma classe CamaroteInferior (que possui a localiza��o do ingresso e m�todos
//para acessar e imprimir esta localiza��o) e uma classe CamaroteSuperior, que �
//mais cara (possui valor adicional). Esta �ltima possui um m�todo para retornar o
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

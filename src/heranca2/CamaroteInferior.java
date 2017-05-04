package heranca2;
//c. crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos
//para acessar e imprimir esta localização) e uma classe CamaroteSuperior, que é
//mais cara (possui valor adicional). Esta última possui um método para retornar o
//valor do ingresso. Ambas as classes herdam a classe VIP.
public class CamaroteInferior extends VIP {
	private String local;
	
	public CamaroteInferior(String local) {
		super();
		this.local = local;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
}

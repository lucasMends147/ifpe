package heranca;
//Um  peixe  � um  animal,  tem  0  patas,  o  seu  ambiente �  o  mar  (padr�o), 
//cor  cinzenta  
//(padr�o). Al�m disso, o peixe tem como caracter�stica: barbatanas e cauda;  

public class Peixe extends Animal {
	private int barbatana;
	private int caudas;
	
	public Peixe(String nome, String ambiente, String cor, double velocidade, 
			double comprimento, int numPatas,int barbatana,int caudas) {
		
		super(nome, "mar", "cinzenta", velocidade, comprimento, 0);
		this.barbatana = barbatana;
		this.caudas = caudas;
		
	}

	public int getBarbatana() {
		return barbatana;
	}

	public void setBarbatana(int barbatana) {
		this.barbatana = barbatana;
	}

	public int getCaudas() {
		return caudas;
	}

	public void setCaudas(int caudas) {
		this.caudas = caudas;
	}



}

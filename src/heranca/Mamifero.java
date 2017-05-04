package heranca;
//Um mam�fero � um animal, o seu ambiente � a terra (padr�o)  e tamb�m possui como  
//caracter�stica o alimento preferido;  
 
public class Mamifero extends Animal{
	private String alimentoPreferido;
	
	public Mamifero(String nome, String ambiente, String cor, double velocidade, 
			double comprimento, int numPatas,String alimentoPreferido) {
		super(nome, "terra", cor, velocidade, comprimento, numPatas);
		this.alimentoPreferido = alimentoPreferido;
		
	}

	public String getAlimentoPreferido() {
		return alimentoPreferido;
	}

	public void setAlimentoPreferido(String alimentoPreferido) {
		this.alimentoPreferido = alimentoPreferido;
	}



}

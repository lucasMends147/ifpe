package heranca;
//Um mamífero é um animal, o seu ambiente é a terra (padrão)  e também possui como  
//característica o alimento preferido;  
 
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

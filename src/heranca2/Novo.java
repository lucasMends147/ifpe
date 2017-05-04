package heranca2;
//Exerc�cio 4: Crie a classe Imovel, que possui um endere�o e um pre�o.
//a. crie uma classe Novo, que herda Imovel e possui um adicional no pre�o. Crie
//m�todos de acesso e impress�o deste valor adicional.
//b. crie uma classe Velho, que herda Imovel e possui um desconto no pre�o. Crie
//m�todos de acesso e impress�o para este desconto.
public class Novo extends Imovel{
	private double adicional;
	
	public Novo(String endereco, double preco,double adicional) {
		super(endereco, preco);
		this.adicional = adicional;
		
	}
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(int adicional) {
		this.adicional = adicional;
	}
	
	public double novoPreco(){
		super.setPreco(super.getPreco() + this.adicional);
		return super.getPreco();
	}

}

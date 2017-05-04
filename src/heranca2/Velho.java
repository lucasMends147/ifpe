package heranca2;
//Exerc�cio 4: Crie a classe Imovel, que possui um endere�o e um pre�o.
//a. crie uma classe Novo, que herda Imovel e possui um adicional no pre�o. Crie
//m�todos de acesso e impress�o deste valor adicional.
//b. crie uma classe Velho, que herda Imovel e possui um desconto no pre�o. Crie
//m�todos de acesso e impress�o para este desconto.
public class Velho extends Imovel{
	private double desconto;
	
	public Velho(String endereco, double preco,double desconto) {
		super(endereco, preco);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double precoDesconto(){
		super.setPreco(super.getPreco() - this.desconto);
		return super.getPreco();
	}

}

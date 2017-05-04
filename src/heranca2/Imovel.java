package heranca2;
//Exerc�cio 4: Crie a classe Imovel, que possui um endere�o e um pre�o.
//a. crie uma classe Novo, que herda Imovel e possui um adicional no pre�o. Crie
//m�todos de acesso e impress�o deste valor adicional.
//b. crie uma classe Velho, que herda Imovel e possui um desconto no pre�o. Crie
//m�todos de acesso e impress�o para este desconto.
public class Imovel {
	private String endereco;
	private double preco;
	
	public Imovel(String endereco, double preco) {

		this.endereco = endereco;
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}

package heranca2;
//Exercício 4: Crie a classe Imovel, que possui um endereço e um preço.
//a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie
//métodos de acesso e impressão deste valor adicional.
//b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie
//métodos de acesso e impressão para este desconto.
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

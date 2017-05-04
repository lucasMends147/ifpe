package heranca2;
//Exercício 4: Crie a classe Imovel, que possui um endereço e um preço.
//a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie
//métodos de acesso e impressão deste valor adicional.
//b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie
//métodos de acesso e impressão para este desconto.
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

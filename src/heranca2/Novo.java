package heranca2;
//Exercício 4: Crie a classe Imovel, que possui um endereço e um preço.
//a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie
//métodos de acesso e impressão deste valor adicional.
//b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie
//métodos de acesso e impressão para este desconto.
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

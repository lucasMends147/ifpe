package L7;

import heranca.ES;

public class Produto {
	private String nome;
	private int codigo;
	private double preco;
	private int quantidade;

	public Produto(String nome, int codigo, double preco, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;

	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void venda (String abc,int quant){
		if (quant <= this.quantidade && abc.equals(this.nome)){
			this.quantidade -= quant;
			
		}else{
				
			ES.md("Produto inexistente ou quantidade insuficiente;");
	
	
		}
	}

}
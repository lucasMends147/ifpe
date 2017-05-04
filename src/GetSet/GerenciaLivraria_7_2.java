package GetSet;

public class GerenciaLivraria_7_2 {
	private String nome;
	private int codigo;
	private double preco;
	private int quant;

	public GerenciaLivraria_7_2(String nome, int codigo, double preco, int quant) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quant = quant;

	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
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

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
}
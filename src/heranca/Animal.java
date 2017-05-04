package heranca;
//Questão  2-  Crie uma classe Animal que  contém um nome, comprimento, número de  
//patas (o padrão é 4), uma cor, ambiente e uma velocidade (em m/s).  

  
public class Animal {
	private String nome;
	private String ambiente;
	private String cor;
	private double velocidade;
	private double comprimento;
	private int numPatas;
	
	public Animal(String nome, String ambiente, String cor, double velocidade, 
			double comprimento, int numPatas) {
		
		this.nome = nome;
		this.ambiente = ambiente;
		this.cor = cor;
		this.velocidade = velocidade;
		this.comprimento = comprimento;
		this.numPatas = 4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
	
}

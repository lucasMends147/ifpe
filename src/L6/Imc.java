package L6;

public class Imc {
	private String nome;
	private double peso;
	private double altura;
	
	public Imc(String nome,double peso,double altura){
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public double getPeso(){
		return this.peso;
	}
	public void setPeso(double peso){
		this.peso = peso;
	}
	public double getAltura(){
		return this.altura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double calcula(){
		double imc = 0;
		return imc = this.peso / (this.altura * this.altura);
	}
	
}

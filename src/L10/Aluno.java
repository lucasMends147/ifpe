package L10;

public class Aluno extends Pessoa{
	private double [] notas = new double [4];
	
	public Aluno(String nome, long cpf, double data,double notas[]) {
		
		super(nome, cpf, data);
		this.notas = notas;
		
	}
	
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double media(){
		double media = 0;
		for(int i = 0; i < this.notas.length;i++){
			media += this.notas[i];
		}
		media /= this.notas.length;
		return media;
	}
//	Questão 01: Crie uma superclasse Pessoa. 
	//Faça duas subclasses, Aluno e Professor,
//	que herdem de Pessoa. A classe Pessoa possui
	//nome, CPF e data de nascimento. A
//	classe Aluno possui 4 notas e a classe 

}


public class Aluno {
	private String nome;
	private	String endereco;
	private	int matricula;
	private double [] nota = new double [4];
	
	public Aluno(String nome,String endereco,int matricula,double[] nota){
		this.nome = nome;
		this.endereco = endereco;
		this.matricula = matricula;
		this.nota = nota;
	}
	public String getNome(){
		return nome;
	}
	public void SetNome(String nome){
		this.nome = nome;
	}
	public String getEndereco(){
		return endereco;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public int getMatricula(){
		return matricula;
	}
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	public double getNota(double[] nota){
		return this.nota[4];
	}
	public void setNota(double[] nota ){
		this.nota = nota;
	}
	public double media(){
		double media = 0;
		for(int i = 0;i < nota.length;i++){
			media += this.nota[i];
		}
		return media/4;
	}
	
}
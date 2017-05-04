package prova;

public class Banco {
	private String nomeAgencia;
	private int numAgencia;
	
	public Banco(String nomeAgencia,int numAgencia){
		this.nomeAgencia = nomeAgencia;
		this.numAgencia = numAgencia;
	}
	public String getNomeAgencia(){
		return this.nomeAgencia;
	}
	public void setNomeAgencia(String nomeAgencia){
		this.nomeAgencia = nomeAgencia;
	}
	public int getNumAgencia(){
		return this.numAgencia;
	}
	public void setNumAgencia(int numAgencia){
		this.numAgencia = numAgencia;
	}
	
	
}

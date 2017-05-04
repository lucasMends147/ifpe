package L10;
//Quest�o 03: Crie uma superclasse Funcion�rio. Fa�a uma subclasse Gerente que
//herde de Funcion�rio. A classe Funcion�rio possui nome, cpf, sal�rio e data de
//nascimento.
public class Funcionario {
	private String nome;
	private String data;
	private double salario;
	private long cpf;
	
	public Funcionario(String nome,String data,double salario,long cpf){
		this.nome = nome;
		this.data = data;
		this.salario = salario;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
}

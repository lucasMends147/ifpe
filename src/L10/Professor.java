package L10;

public class Professor extends Pessoa {
	private double salario;
	//Professor possui salário. Crie uma classe

	public Professor(String nome, long cpf, double data,double salario) {
		super(nome, cpf, data);
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}

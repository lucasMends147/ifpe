package L10;
	//Fa�a um m�todo Calcular Sal�rio em Gerente que calcule o valor do
	//sal�rio com uma gratifica��o de R$ 2.000,00 (sal�rio + R$ 2.000,00). Crie uma
	//classe teste que forne�a as seguintes op��es:
	
public class Gerente extends Funcionario {

		public Gerente(String nome, String data, double salario, long cpf) {
			super(nome, data, salario, cpf);
		
		}

		public void newSal(){
			super.setSalario(super.getSalario() + 2000);
		}
}

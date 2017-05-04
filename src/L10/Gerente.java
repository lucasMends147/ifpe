package L10;
	//Faça um método Calcular Salário em Gerente que calcule o valor do
	//salário com uma gratificação de R$ 2.000,00 (salário + R$ 2.000,00). Crie uma
	//classe teste que forneça as seguintes opções:
	
public class Gerente extends Funcionario {

		public Gerente(String nome, String data, double salario, long cpf) {
			super(nome, data, salario, cpf);
		
		}

		public void newSal(){
			super.setSalario(super.getSalario() + 2000);
		}
}

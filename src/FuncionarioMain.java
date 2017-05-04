import java.util.ArrayList;
import java.util.List;

import L6.Funcionario;
import Registro_L.ES;

public class FuncionarioMain {
//	Questão 01: Escreva um programa que controle os funcionários de uma empresa. É
//	necessário saber o nome e o salário desses funcionários. Escreva um método que receba
//	uma lista de funcionários e retorne os que recebem mais que R$ 5.000,00. Crie uma
//	classe teste que forneça as seguintes opções:


	public static void main(String[] args) {
		String nome = "";
		String p = "";
		double salario = 0;
		List <Funcionario> func = new ArrayList <Funcionario> ();
		int op = 0;
		Funcionario faux = new Funcionario(nome, salario);
		do{
			op = ES.PI(op, "Digite 1 para criar funcionário"
					+ "\n" + "Digite 2 para consultar funcionários de alta renda"
					+ "\n" + "Digite 0 para sair");
			
			switch(op){
				case 1:
				
			faux.setNome(ES.PS("Digite o nome:"));
			faux.setSalario(ES.PD(salario, "Digite o salario:"));
			func.add(faux);
			
			for(int i = 0;i < func.size();i++){
				if(func.get(i).getSalario() > 5000 ){
					p =  p + "O funcionário  " + func.get(i).getNome() 
							+ " tem uma renda de " + func.get(i).getSalario() + " \n"  ;
					break;
				}
			}
			break;
			
				case 2:
					
					System.out.println(p);
					break;
					
				case 0:
					System.out.println("Adeus!");
					break;
				default:
					System.out.println("Valor inválido,tente novamente:");
					
			}
		}while(op !=0 );
		
	}
}

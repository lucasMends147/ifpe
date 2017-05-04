package L6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import heranca.ES;

public class E1_main {
	//Questão 01: Escreva um programa que controle os funcionários de uma empresa. É
	//necessário saber o nome e o salário desses funcionários. Escreva um método que receba
	//uma lista de funcionários e retorne os que recebem mais que R$ 5.000,00. Crie uma
	//classe teste que forneça as seguintes opções:
	//1. Cadastrar um funcionário
	//2. Exibir os funcionários de alta renda
	//0. Sair
	public static void main(String[] args) {
		String funcAlt = "";
		List <Funcionario> listFunc = new ArrayList <>();
		Funcionario eaux = null;
		String nome = "";
		double salario = 0;
		boolean ver = true;
		int op = 0;
		
		do{
			eaux = new Funcionario(nome,salario);
			
			eaux.setNome(ES.PS("Digite o nome do funcionario;"));
			
			eaux.setSalario(ES.PD("Digite o salario do funcionario; "));
			
			listFunc.add(eaux);
			
			op = ES.PI("Digite 1 para adicionar outro funcionário ou 2 para sair;");
			
			if(op == 1){
				ver = true;
			}else if(op == 2){
				ver = false;
			}
			
		}while(ver == true);
		
			for(int i = 0; i < listFunc.size();i++){
				listFunc.get(i).salario();
				
				if(listFunc.get(i).salario() == true){
					
					funcAlt +=  "\n" + "O funcionário " + listFunc.get(i).getNome() + " recebe " + 
				listFunc.get(i).getSalario();
					
				}
			}
		
			if(funcAlt.equals("")){
				funcAlt = "Não há funcionários de alta renda;";
				
			}
		
		ES.md(funcAlt);
		
	}

}

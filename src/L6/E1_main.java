package L6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import heranca.ES;

public class E1_main {
	//Quest�o 01: Escreva um programa que controle os funcion�rios de uma empresa. �
	//necess�rio saber o nome e o sal�rio desses funcion�rios. Escreva um m�todo que receba
	//uma lista de funcion�rios e retorne os que recebem mais que R$ 5.000,00. Crie uma
	//classe teste que forne�a as seguintes op��es:
	//1. Cadastrar um funcion�rio
	//2. Exibir os funcion�rios de alta renda
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
			
			op = ES.PI("Digite 1 para adicionar outro funcion�rio ou 2 para sair;");
			
			if(op == 1){
				ver = true;
			}else if(op == 2){
				ver = false;
			}
			
		}while(ver == true);
		
			for(int i = 0; i < listFunc.size();i++){
				listFunc.get(i).salario();
				
				if(listFunc.get(i).salario() == true){
					
					funcAlt +=  "\n" + "O funcion�rio " + listFunc.get(i).getNome() + " recebe " + 
				listFunc.get(i).getSalario();
					
				}
			}
		
			if(funcAlt.equals("")){
				funcAlt = "N�o h� funcion�rios de alta renda;";
				
			}
		
		ES.md(funcAlt);
		
	}

}

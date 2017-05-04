package L6;

import java.util.ArrayList;

import heranca.ES;

public class E3_main {
//	1. Cadastrar uma pessoa
//	2. Mostrar as pessoas que estão abaixo do peso (IMC < 18,5)
//	3. Mostrar as pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC <
//	25)
//	4. Mostrar as pessoas que estão acima do peso (IMC > = 25)
//	0. Sair

	public static void main(String[] args) {
		ArrayList <Imc> listimc = new ArrayList <Imc>();
		double peso = 0;
		double altura = 0;
		String nome = "";
		int op = 0;
		boolean ver = true;
		String nomes = "";
		
		
		do{
			op = ES.PI("Digite 1 para cadastrar pessoa  \n2.Para mostrar imc < 18,5  \n3.Para mostrar peso ideal"
					+ "\n4.Para mostrar imc >= 25; \n0.Para sair");
			
			
			switch(op){
			case 1:
				Imc eaux = new Imc (nome,peso,altura);
				
				eaux.setNome(ES.PS("Digite o nome;"));
				eaux.setAltura(ES.PD("DIgite a altura;"));
				eaux.setPeso(ES.PD("Digite o peso;"));
				
				listimc.add(eaux);
				break;
			
			case 2:
				for(int i = 0;i < listimc.size();i++){
					if(listimc.get(i).calcula() < 18.5){	
						nomes += listimc.get(i).getNome() + "\n" ;
					}else if((i+1) == listimc.size()){
						nomes = "Não há pessoas cadastradas com essa faixa de peso!";
					}
					}
					ES.md(nomes);
					nomes = "";
					break;
				
				
			case 3:
				for(int i = 0;i < listimc.size();i++){
					if(listimc.get(i).calcula() > 18.5 && listimc.get(i).calcula() < 25){	
						nomes += listimc.get(i).getNome() + "\n" ;
						
					}else if((i+1) == listimc.size()){
						nomes = "Não há pessoas cadastradas com essa faixa de peso!";
					}
				}
				ES.md(nomes);
				nomes = "";
				break;
				
			case 4:
				for(int i = 0;i < listimc.size();i++){
					if(listimc.get(i).calcula() >= 25){	
						nomes += listimc.get(i).getNome() + "\n" ;
					}else if((i+1) == listimc.size()){
						nomes = "Não há pessoas cadastradas com essa faixa de peso!";
					}
					
					}
					ES.md(nomes);
					nomes = "";
					break;
				
			case 0:
				ES.md("Adeus!");
				ver = false;
				break;
				
			default:
				
				ES.md("Número inválido,tente de novo!");
			
			}
			
		}while(ver == true);

	}

}

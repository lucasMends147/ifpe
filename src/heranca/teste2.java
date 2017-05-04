package heranca;

import java.util.ArrayList;

import prova.Entrada;

public class teste2 {

	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<>();
		String nome = "", ambiente = "", cor = "",alimentoPreferido = "";
		double velocidade = 0, comprimento = 0;
		int numPatas = 0, opcao = 0,barbatana = 0, caudas = 0;
		boolean ver = true;
		
		Peixe paux = null;
		Mamifero maux = null;
		
		
		do{
			opcao = Entrada.lerInt("1.Adicionar um peixe" + "\n2.Adicionar um mamifero"
					+ "\n3.Listar todos os animais" + "\n4.Listar todos os peixes" + "0.Sair");
			
			switch(opcao){
			case 1:
//				String nome, String ambiente, String cor, double velocidade, 
//				double comprimento, int numPatas
				nome = Entrada.lerString("Digite o nome do peixe: ");
				ambiente = Entrada.lerString("Digite o ambiente: ");
				cor = Entrada.lerString("Digite a cor :");
				velocidade = Entrada.lerDouble("Digite a velocidade ");
				comprimento = Entrada.lerDouble("Digite o comprimento:");
				numPatas = Entrada.lerInt("Digite a quantidade de patas");
				barbatana = Entrada.lerInt("Digite a quantidade de barbatanas: ");
				caudas = Entrada.lerInt("Digite a quantidade de caudas :");
				
				paux = new Peixe(nome,"mar","cinzenta",velocidade,comprimento,numPatas,barbatana,caudas);
				
				list.add(paux);
				
				//1) Incluir dados relativo a um peixe;  
				break;
				
			case 2:
				nome = Entrada.lerString("Digite o nome do mamifero: ");
				ambiente = Entrada.lerString("Digite o ambiente: ");
				cor = Entrada.lerString("Digite a cor :");
				velocidade = Entrada.lerDouble("Digite a velocidade ");
				comprimento = Entrada.lerDouble("Digite o comprimento:");
				numPatas = Entrada.lerInt("Digite a quantidade de patas");
				alimentoPreferido = Entrada.lerString("Digite o alimento preferido: ");
				
				maux = new Mamifero(nome,"terra",cor,velocidade,comprimento,4,alimentoPreferido);
				
				list.add(maux);
				
				//2)  Incluir dados relativo a um mamífero;  
				break;
				
			case 3:
				String tudo = "";
				
				for(int i = 0;i < list.size();i++){
					if(list.get(i) instanceof Mamifero){
						tudo += "Mamifero de nome : " + list.get(i).getNome() + "\n";
					}else if(list.get(i) instanceof Peixe){
						tudo += "Peixe de nome : " + list.get(i).getNome() + "\n";
					}
					
				}
				System.out.println(tudo);
				//3) Listar todos os animais cadastrados;  
				break;
				
			case 4:
				String mostra = "Peixes : " + "\n\n";
				for(int i = 0;i < list.size();i++){
					if(list.get(i) instanceof Peixe){
						mostra += "Peixe : " + list.get(i).getNome() + "\n";
						
					}
				}
				System.out.println(mostra);
				//4) Lista todos os peixes cadastrados 
				break;
				
			case 0:
				System.out.println("Adeus!");
				ver = false;
				
				break;
				
			default:
				System.out.println("Inválido! Tente novamente");
			}
			
		}while(ver == true);
	}

}

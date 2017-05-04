package L10;

import java.util.ArrayList;

import prova.Entrada;

public class teste {

	public static void main(String[] args) {
		ArrayList<Pessoa> list = new ArrayList<>();
		String nome,mostra = "";
		long cpf;
		double [] notas = new double [4];
		double salario,data;
		int opcao = 0;
		Aluno aaux = null;
		Professor paux = null;
		
		do{
			opcao = Entrada.lerInt("1.Cadastrar aluno" + "\n2.Cadastrar professor"
									+ "\n3.Media aluno" + "\n4.Informaçoes aluno"
									+ "\n5.Informações professor" + "\n0.Sair");
			switch(opcao){
			case 1:
				
				nome = Entrada.lerString("Digite o nome do aluno :");
				cpf = Entrada.lerLong("Digite o cpf do aluno :");
				data = Entrada.lerDouble("Digite a data de nascimento do aluno (dd/mm/aa)");
				
				notas = new double [4];
				
				for(int i = 0; i < notas.length;i++){
					notas[i] = Entrada.lerDouble("Digite a " + (i + 1) + "º nota do aluno ");
				}
				
				aaux = new Aluno(nome,cpf,data,notas);
				
				list.add(aaux);
				break;
				
				
			case 2:
				
				nome = Entrada.lerString("Digite o nome do professor :");
				cpf = Entrada.lerLong("Digite o cpf do professor :");
				data = Entrada.lerDouble("Digite a data de nascimento do professor (dd/mm/aa)");
				salario = Entrada.lerDouble("Digite o salario do professor :");
				
				paux = new Professor(nome,cpf,data,salario);
				list.add(paux);
				break;
				
			case 3:
				
				for(int i = 0; i < list.size();i++){
					if(list.get(i) instanceof Aluno){
						
						//cast (Aluno) list.get(i);
						
						Aluno aux = (Aluno) list.get(i);
						mostra += "Nome: " + aaux.getNome() + "\nMédia: " + aaux.media()
						+ "\n\n";
				
					}
				}
				Entrada.mostra(mostra);
				//limpando a string pra nao pegar dos outros cases
				mostra = "";
				break;
				
			case 4:
				for(int i = 0; i < list.size();i++){
					if(list.get(i) instanceof Aluno){
						
						//Cast(Aluno) força o list.get(i) a ser um 
						//objeto aluno e ter seus metodos 
						//e atributos;
						
						aaux = (Aluno) list.get(i);
						mostra += "Nome: " + aaux.getNome() 
								+ "\nMédia: " + aaux.media() 
								+ "\nCPF: " + aaux.getCpf()
								+ "\nData de nascimento" + aaux.getData() + "\n\n";

						
					}
				}
				Entrada.mostra(mostra);
				//limpando a string pra nao pegar dos outros cases
				mostra = "";
				break;

			case 5:
				for(int i = 0; i < list.size();i++){
					if(list.get(i) instanceof Professor){
						//paux = (Professor) é o cast,ta forçando
						//o list.get(i) a ser um objeto professor;
						paux = (Professor) list.get(i);
						mostra += "Nome: " + paux.getNome()  
								+ "\nSalário: " + paux.getSalario() 
								+ "\nCPF: " + paux.getCpf()
								+ "\nData de nascimento" + paux.getData() + "\n\n";
					}
				}
				Entrada.mostra(mostra);
				//limpando a string pra nao pegar dos outros cases
				mostra = "";
				break;
			
			case 0:
				
				Entrada.mostra("Adeus!");
				break;
				
			default:
				Entrada.mostra("Inválido! Tente novamente :");
				

				
			}
			
		}while(opcao !=0);

	}

}

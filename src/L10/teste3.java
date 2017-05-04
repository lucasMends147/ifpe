package L10;

import java.util.ArrayList;

import prova.Entrada;

public class teste3 {

	public static void main(String[] args) {
	ArrayList<Funcionario> list = new ArrayList<>();
	Funcionario funcionario = null;
	Gerente gerente = null;
	String nome,data,mostra = "";
	long cpf;
	double salario;
	int opcao;
	boolean ver =  true;
	
	do{
		opcao = Entrada.lerInt("1.Adicionario funcionario" + "\n2.Adicionar gerente"
								+ "\n3.Listar funcionarios" + "\n4.Mostrar salario gerente (cpf)"
								+ "\n0.Sair");
		
		switch(opcao){
			case 1:
				nome = Entrada.lerString("Digite o nome do funcionario: ");
				data = Entrada.lerString("Digite a data de aniversario do funcionario: ");
				salario = Entrada.lerDouble("Digite o salário do funcionario :");
				cpf = Entrada.lerLong("Digite o cpf do funcionario :");
				
				funcionario = new Funcionario(nome,data,salario,cpf);
				list.add(funcionario);
				
				//1. Adicionar Funcionário
				//String nome,String data,double salario,long cpf
				break;
			case 2:
				nome = Entrada.lerString("Digite o nome do gerente: ");
				data = Entrada.lerString("Digite a data de aniversario do gerente: ");
				salario = Entrada.lerDouble("Digite o salário do gerente :");
				cpf = Entrada.lerLong("Digite o cpf do gerente :");
				
				gerente = new Gerente(nome,data,salario,cpf);
				list.add(gerente);
				//2. Adicionar Gerente
				break;
			case 3:
				for(int i = 0; i < list.size();i++){
					if(list.get(i) instanceof Funcionario){
						mostra += "Nome : " + list.get(i).getNome()
								+ "\nCPF : " + list.get(i).getCpf()
								+ "\nData : " + list.get(i).getData()
								+ "\nSalário : " + list.get(i).getSalario() + "\n\n";
					}
				}
				Entrada.mostra(mostra);
				mostra = "";
				//3. Listar todos os funcionários
				
				break;
			case 4:
				cpf = Entrada.lerLong("Digite o cpf a ser procurado : ");
				
				for(int i = 0; i < list.size();i++){
					
					if(list.get(i) instanceof Gerente && cpf == list.get(i).getCpf()){
						
						gerente = (Gerente) list.get(i);
						gerente.newSal();
						mostra += "Nome : " + list.get(i).getNome()
								+ "\nCPF : " + list.get(i).getCpf()
								+ "\nData : " + list.get(i).getData()
								+ "\nSalário : " + gerente.getSalario() + "\n\n";
					}
				}
				Entrada.mostra(mostra);
				mostra = "";
				//4. Mostrar o salário do gerente (procurar pelo CPF)
				break;
	
			case 0:
				Entrada.mostra("Adeus!");
				ver = false;
				//0. Sair
				
				
				break;
				
			default:
					Entrada.mostra("Inválido! Tente novamente");
				break;
		}
		
		
	}while(ver == true);

	}

}

package L10;

import java.util.ArrayList;

import prova.Entrada;

public class teste2 {

	public static void main(String[] args) {
		ArrayList<Cliente> list = new ArrayList<>();
		String nome,banco,mostra = "";
		long cpf;
		double saldo,taxa;
		int numConta,opcao;
		ContaPoupanca cpaux = null;
		ContaCorrente ccaux = null;
		Cliente caux = null;
		
		do{
			opcao = Entrada.lerInt("1.Cadastrar cliente" + "\n2.Saque conta corrente"
							+ "\n3.Saque poupan�a" + "\n4.Deposito Conta Corrente" 
							+ "\n5.Deposito poupan�a" + "\n0.Sair");
			
			switch(opcao){
			
			case 1:
				//1. Cadastrar Cliente (Incluindo Conta corrente e Poupan�a)
				banco = Entrada.lerString("Digite o nome do banco(conta poupan�a");
				numConta = Entrada.lerInt("Digite o n�mero da conta Poupan�a");
				taxa = Entrada.lerDouble("Digite a taxa saldo da conta Poupan�a");
				saldo = Entrada.lerDouble("Digite o saldo da conta Poupan�a");
				
				//conta poupan�a
				cpaux = new ContaPoupanca(banco,numConta,taxa,saldo);
				
				
				banco = Entrada.lerString("Digite o nome do banco(conta corrente)");
				numConta = Entrada.lerInt("Digite o n�mero da conta corrente");
				taxa = Entrada.lerDouble("Digite a taxa saldo da conta corrente");
				saldo = Entrada.lerDouble("Digite o saldo da conta corrente");
				
				//conta corrente
				ccaux = new ContaCorrente(banco,numConta,taxa,saldo);
				
				nome = Entrada.lerString("Digite o nome do cliente ");
				cpf = Entrada.lerLong("Digite o n�mero do cpf ");
				
				//cliente
				caux = new Cliente(nome,cpf,ccaux,cpaux);
				
				list.add(caux);
				
				break;
				
			case 2:
				cpf = Entrada.lerLong("Digite o n�mero do cpf a ser procurado ");
				
				for(int i = 0 ; i <list.size() ;i++){
					if(cpf == list.get(i).getCpf()){
						double valor = Entrada.lerDouble
								("Digite o valor a ser sacado");
						list.get(i).getContaC().sacar(valor);
						Entrada.mostra("Novo valor : " + list.get(i).getContaC().getSaldo());
					}
				}
				//2. Saque da conta corrente (Procurar pelo CPF do Cliente)
				break;
			case 3:
				cpf = Entrada.lerLong("Digite o n�mero do cpf a ser procurado ");
				
				for(int i = 0 ; i <list.size() ;i++){
					if(cpf == list.get(i).getCpf()){
						double valor = Entrada.lerDouble
								("Digite o valor a ser sacado");
						list.get(i).getContaP().sacar(valor);
						Entrada.mostra("Novo valor : " + list.get(i).getContaP().getSaldo());
					}
				}
				//3. Saque da poupan�a (Procurar pelo CPF do Cliente)
				break;
			case 4:
				cpf = Entrada.lerLong("Digite o n�mero do cpf a ser procurado ");
				
				for(int i = 0 ; i <list.size() ;i++){
					if(cpf == list.get(i).getCpf()){
						double valor = Entrada.lerDouble
								("Digite o valor a ser sacado");
						list.get(i).getContaC().depositar(valor);
						Entrada.mostra("Novo valor : " + list.get(i).getContaC().getSaldo());
					}
				}
				//4. Dep�sito da conta corrente (Procurar pelo CPF do Cliente)
				break;
			case 5:
				cpf = Entrada.lerLong("Digite o n�mero do cpf a ser procurado ");
				
				for(int i = 0 ; i <list.size() ;i++){
					if(cpf == list.get(i).getCpf()){
						double valor = Entrada.lerDouble
								("Digite o valor a ser sacado");
						list.get(i).getContaP().depositar(valor);
						Entrada.mostra("Novo valor : " + list.get(i).getContaP().getSaldo());
					}
				}
				//5. Dep�sito da poupan�a (Procurar pelo CPF do Cliente)
				break;
			case 0:
				//0. Sair
				Entrada.mostra("Adeus!");
				break;
			default:
				Entrada.mostra("Inv�lido! Tente novamente;");
			}
			
		}while(opcao !=0);

	}

}

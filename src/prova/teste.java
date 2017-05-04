package prova;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class teste {
	public static void main(String[] args) {
		
		ArrayList <Conta> list = new ArrayList<>();
		
		String nomeAgencia = "";
		int numAgencia = 0,numero = 0 ,opcao = 0;
		String nome = "";
		long cpf = 0, procuraCpf = 0;
		double saldo = 0,juros = 0;
		
		
		Cliente c = null;
		Banco b = null;
		Conta caux = null;
		int cont = 0;
		
		do{
			switch(opcao){
			case 1:
				if(cont < 10){
					
				
				String pede = Entrada.lerString("Digite conta para conta e poupança para poupança: ");
				
				if(pede.equalsIgnoreCase("poupança")){
					nomeAgencia = Entrada.lerString("Digite o nome da agencia do banco :");
					numAgencia = Entrada.lerInt("Digite o número da agencia :");
					
					b = new Banco(nomeAgencia,numAgencia);
					
					nome = Entrada.lerString("Digite o nome do cliente : ");
					cpf = Entrada.lerLong("Digite o cpf do cliente: ");
					saldo = Entrada.lerDouble("Digite o seu saldo : ");
					
					c = new Cliente(nome,cpf,saldo);
					
					numero = Entrada.lerInt("Digite o número da conta :");
					juros = Entrada.lerDouble("Digite o juros a ser rendido :");
					
					caux = (Conta) new ContaPoupanca(numero,b,c,juros);
					
					list.add(caux);
					cont++;
				}
				
				else if(pede.equalsIgnoreCase("conta")){
					nomeAgencia = Entrada.lerString("Digite o nome da agencia do banco :");
					numAgencia = Entrada.lerInt("Digite o número da agencia :");
					
					b = new Banco(nomeAgencia,numAgencia);
					
					nome = Entrada.lerString("Digite o nome do cliente : ");
					cpf = Entrada.lerLong("Digite o cpf do cliente: ");
					saldo = Entrada.lerDouble("Digite o seu saldo : ");
					
					c = new Cliente(nome,cpf,saldo);
					
					numero = Entrada.lerInt("Digite o número da conta :");
					
					caux = new Conta(numero,b,c);
					
					list.add(caux);
					cont++;
				}else
					JOptionPane.showMessageDialog(null,
					"Número máximo de contas excedido ou nome inválido: ");
			
				break;
				
				}
		
			case 2:
				
				procuraCpf = Entrada.lerLong("Digite o cpf a ser buscado : ");
				
				for(int i = 0;i < list.size();i++){
					if(list.get(i) instanceof Conta && procuraCpf == list.get(i).getC().getCpf()){
						double valor = Entrada.lerDouble("Digite o valor a ser depositado : ");
						
						list.get(i).getC().setSaldo(list.get(i).getC().getSaldo() + valor);
					}
				}
				//2. Realizar depósito (Buscar pelo CPF do cliente)
				
				break;
			case 3:
				procuraCpf = Entrada.lerLong("Digite o cpf a ser buscado : ");
				String mostrar = "";
				
				for(int i = 0;i < list.size();i++){
					if(procuraCpf == list.get(i).getC().getCpf()){
					if(list.get(i) instanceof ContaPoupanca){ 
						ContaPoupanca aux = (ContaPoupanca) list.get(i);
						
						aux.renderJuros();
						mostrar = "Novo saldo : " +aux.getC().getSaldo();
						
					}	
					}
				}
				JOptionPane.showMessageDialog(null,mostrar);
				//3. Render Juros (Buscar pelo CPF do cliente)
				break;
			case 4:
				numAgencia = Entrada.lerInt("Digite o número da agencia : ");
				nomeAgencia = Entrada.lerString("Digite o nome da agencia : ");
				String mostra = "";
				
				for(int i = 0;i < list.size();i++){
					if(numAgencia == list.get(i).getB().getNumAgencia()
						&& list.get(i).getB().equals(nomeAgencia)){
						mostra += "Nome : " + list.get(i).getC().getNome()
								+ "CPF : " + list.get(i).getC().getCpf()
								+ "\n\n";
						
					}
				}
				
				JOptionPane.showMessageDialog(null,mostra);
				
				//4. Consultar número e nome da agência (Mostrar nome e o CPF do cliente)
				
				break;
			case 5:
				nome =	Entrada.lerString("Digite o nome a ser procurado : ");
				
				for(int i = 0;i < list.size();i++){
					if(list.get(i).getC().getNome().equals(nome)){
						String mudar = Entrada.lerString("Digite o novo nome da agencia: ");
						list.get(i).getB().setNomeAgencia(mudar);
					}
				}
				//5. Alterar o número e nome da agência (Buscar pelo nome do cliente)
				
				break;
			case 0 :
				
				//0. Sair
				//Obs.: O sistema deve permitir o cadastro de 10 (dez) clientes.
				JOptionPane.showMessageDialog(null,"Adeus!");
				break;
				
			default :
				JOptionPane.showMessageDialog(null,"Número inválido,tente novamente!");
				
			}
			
		}while(opcao !=0);
		

	}

}

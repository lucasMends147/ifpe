package L7;

import java.util.ArrayList;
import java.util.List;

import heranca.ES;

public class E3_main {
	public static void main(String[] args) {
		List <Conta> listConta = new ArrayList <>();
		int numero = 0,agencia = 0,opcao = 0;
		String nome = "",pede = "";
		double valor = 0;
		long cpf = 0;
		double saldo = 0;
		boolean ver = true;
		Conta caux = null;
		
		do{
			opcao = ES.PI("Digite 1 para cadastrar conta "
						+ "\n2.Realizar deposito "
						+ "\n3.Realizar saque"
						+ "\n4.Verificar saldo"
						+ "\n5.Consultar cliente"
						+ "\n0.Sair");
			
			switch(opcao){
			case 1:
				caux = new Conta(numero,agencia,nome,saldo,cpf);
				caux.setNome(ES.PS("Digite o nome; "));
				caux.setNumero(ES.PI("Digite o número da conta;"));
				caux.setAgencia(ES.PI("Digite o número da agencia;"));
				caux.setCpf(ES.PL("Digite o seu cpf;"));
				caux.setSaldo(ES.PD("Digite o saldo da conta;"));
				
				listConta.add(caux);
				break;
				
			case 2:
				
				valor = ES.PD("Digite o valor a ser depositado;");
				pede = ES.PS("Digite o nome a ser procurado;");
				
				for(int i = 0; i < listConta.size();i++){
					listConta.get(i).deposito(pede, valor);
				}
				break;
				
			case 3:
				pede = ES.PS("Digite o nome a ser procurado;");
				valor = ES.PD("Digite o valor a ser sacado;");
				
				for(int i = 0; i < listConta.size();i++){
					listConta.get(i).saque(pede, valor);
				}
				break;
				
			case 4:
				pede = ES.PS("Digite o nome a ser procurado;");
				
				for(int i = 0; i < listConta.size();i++){
					if(listConta.get(i).verifica(pede)){
						ES.md("Cliente " + pede + "\nSaldo :" + listConta.get(i).getSaldo());
					}
					
				}
				break;
			
			case 5:
				
				pede = ES.PS("Digite o nome a ser procurado;");
				
				for(int i = 0; i < listConta.size();i++){
					
					if(listConta.get(i).consulta(pede)){
						
						ES.md("Cliente :" + pede + "\nCPf : " + listConta.get(i).getCpf());
					}
					
				}
				break;
				
			case 0:
				ES.md("Adeus!");
				ver = false;
				break;
				
			default:
				ES.md("Inválido,tente novamente");
				
			}
			
		}while(ver == true);
		

	}

}

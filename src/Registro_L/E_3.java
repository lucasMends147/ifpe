package Registro_L;

import java.util.ArrayList;
import java.util.List;

public class E_3 {
	// 3. Faça um algoritmo que, inicialmente, cadastre 5
	// clientes e depois 5 contas, cada conta
	// de um cliente. No final imprima o saldo mais alto e o
	// cliente desta conta.  	// Código CodigoConta
	// Nome DataAbertura					Saldo
	// CPF 
	// Cliente Conta
	public static void main(String[] args) {
		List <Client> cliente = new ArrayList <Client>();
		List <Conta> conta = new ArrayList <Conta>();
		
		for(int i = 0;i < 5;i++){
			Client caux = new Client();
			
			caux.codigo = ES.PL(caux.codigo,"Digite o codigo do cliente:");
			caux.nome = ES.PS("Digite o nome :");
			caux.cpf = ES.PL(caux.cpf,"Digite o cpf do cliente:");
			
			cliente.add(caux);
		}
		
		for(int i = 0; i < 5;i++){
			Conta caux = new Conta();
			
			caux.codigo = ES.PL(caux.codigo, "Digite o codigo da conta: ");
			caux.data = ES.PS("Digite a data : ");
			caux.saldo = ES.PD(caux.saldo, "Digite o saldo da conta: ");
			
			conta.add(caux);
		}
		double maior = 0;
		String c = "";
		for(int i = 0;i < conta.size();i++){
			if(conta.get(i).saldo > maior){
				maior = conta.get(i).saldo;
				c = cliente.get(i).nome;
			}
		}
		
		System.out.println("O maior saldo é de: " + maior
				+ "\n" + "O nome do cliente é: " + c);
	}

}
class Client{
	long codigo;
	String nome;
	long cpf;
}
class Conta{
	long codigo;
	String data;
	double saldo;
}
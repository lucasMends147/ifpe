package L_String;

import java.util.Scanner;

public class E_7 {
//	7. Faça um programa que receba uma frase e uma palavra, calcule e mostre a quantidade
//	de vezes que a palavra digitada aparece na frase.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String pede = "";
		String verifica = "";
		int cont = 0;
		
		System.out.println("Digite uma frase;");
		pede = entrada.nextLine();
		
		System.out.println("Digite uma frase a ser buscada");
		verifica = entrada.nextLine();
		
		for(int i = 0;i < pede.length();i++){
			if(pede.contains(verifica)){
				cont++;
			}
		}
		System.out.println("A palavra " + verifica + " aparece " + cont + " vezes!" );
	}

}

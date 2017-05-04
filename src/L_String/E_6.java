package L_String;

import java.util.Scanner;

public class E_6 {
//	6. Crie um programa que receba uma frase, calcule e mostre a quantidade de vogais da
//	frase digitada. O programa deverá contar vogais maiúsculas e minúsculas
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String p = "";
	String vog = "aeiouAEIOU";
	int cont = 0;
	
	System.out.println("Digite uma frase");
	p = entrada.nextLine();
	String r ="";
	for(int i = 0;i < p.length();i++){
		String n = p.substring(i, (i+1));
		
		if(vog.contains(n)){
			r += "Vogal " + n + "\n";
			cont++;
		}
	}
	System.out.println(r + "\n" + cont + " vogais!");

	}

}

package L_String;

import java.util.Scanner;

public class E_2 {
//	2. Faça um programa em Java que mostre a seguinte saída: (Utilize o método charAt()).
//	J
//	Ja
//	Jav
//	Java
//	Jav
//	Ja
//	J
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String p = "";
	String x = "";
	String k = "";
	
	System.out.println("Digite uma frase: ");
	p = entrada.next();
	
	for(int i =0; i < p.length();i++){
		x += p.charAt(i);
		
		System.out.println(x);
	}
	int g = p.length();
	
	int b = g -1;
	
	for(int i = g; i > 0;i--){
		if(i != g){
			k = p.substring(0, i);
			System.out.println(k);
		}
	
	}
	
	}

}

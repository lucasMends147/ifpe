package L_String;

import java.util.Scanner;

public class E_4 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String n = "";
	String m = "";
	String s = "";
	
	System.out.println("digite uma frase:");
	n = entrada.nextLine();
	
	System.out.println("Digite uma palavra para substituir da frase anterior");
	m = entrada.nextLine();
	
	System.out.println("Digite uma palavra para substituir");
	s = entrada.nextLine();
	
	
		m = n.replace(m,s);
		
		System.out.println(m);
	}

}

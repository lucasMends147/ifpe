package L_String;

import java.util.Scanner;

public class E_3 {
//	3. Construa uma classe em Java que peça ao usuário para digitar um texto em letras
//	maiúsculas e mostre o texto em letra minúscula, em seguida solicite-o um texto em
//	letra minúscula e mostre-o em letra maiúsculas. (Utilize os métodos toLowerCase() e
//	toUpperCase() ).

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String p = "",t = "";
		
		System.out.println("Digite uma frase minuscula");
		p = entrada.nextLine();
		
		System.out.println("Digite uma frase minuscula");
		t = entrada.nextLine();
		
		System.out.println("Primeira frase:" + p.toUpperCase()
		+ "\n" + "Segunda frase: " + t.toLowerCase());
	}

}

package L_String;

import java.util.Scanner;

public class E_3 {
//	3. Construa uma classe em Java que pe�a ao usu�rio para digitar um texto em letras
//	mai�sculas e mostre o texto em letra min�scula, em seguida solicite-o um texto em
//	letra min�scula e mostre-o em letra mai�sculas. (Utilize os m�todos toLowerCase() e
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

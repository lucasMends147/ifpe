package L_String;
import java.util.Scanner;
public class E_5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String n = "";
		String r = "";
		
		System.out.println("Digite uma frase:");
		n = entrada.nextLine();
		
		System.out.println("Digite a frase que deseja recuperar");
		r = entrada.nextLine();
		
		System.out.println("O índice é: " + n.indexOf(r));
	}

}

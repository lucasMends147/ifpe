package Registro_L;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		List <Habit> habit = new ArrayList <Habit> ();
		
		for(int i = 0; i <= 50 ; i++){
			Habit haux = new Habit();
			System.out.println("Digite o salário: ");
			haux.salario = entrada.nextDouble();
			
			System.out.println("Digite a idade: ");
			haux.idade = entrada.nextInt();
			
			System.out.println("Digite a quantidade de filhos: ");
			haux.numFi = entrada.nextInt();
			
			habit.add(haux);
			
		}
		double salariof= 0,mediaf= 0,maiorS = 0;
		
		for(int i = 0; i < habit.size();i++){
			if(habit.get(i).salario > maiorS){
				maiorS = habit.get(i).salario;
			}
			
			salariof += habit.get(i).salario;
			mediaf += habit.get(i).numFi;

		}
		salariof /= habit.size();
		mediaf /= habit.size();
		
		System.out.println("A média dos salários é de:" + salariof
			+	"\n" + "A média de filhos é de: " + mediaf
			+  	"\n" + "O maior salário é de: " + maiorS);
	}

}
class Habit{
	double salario;
	int idade,numFi;
}
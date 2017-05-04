package Registro_L;

import java.util.ArrayList;
import java.util.List;

public class E_2 {
	// 2. Foi realizada uma pesquisa entre 20 habitantes de uma cidade.
	// De cada habitante
	// foram coletados os dados: idade, sexo, renda familiar
	// e número de filhos.
	// Faça um
	// algoritmo que leia esses dados e armazene-os em um array
	
	public static void main(String[] args) {
		List <Habitt> habit = new ArrayList <Habitt> ();
		
		for(int  i = 0;i < 2;i++){
			Habitt haux = new Habitt ();
			
			haux.idade = ES.PI
					(haux.idade, "Digite a idade:");
			
			haux.numFi = ES.PI
					(haux.numFi, "Digite a quantidade de filhos:");
			
			haux.renda = ES.PD
					(haux.renda, "Digite a renda: ");
			
			haux.sexo = ES.PS("Digite o sexo: ");
			
			habit.add(haux);
		}int menor = 100, maior = 0,mf = 0;
		
		for(int i = 0;i < habit.size();i++){
			if(habit.get(i).idade> maior){
				
				maior = habit.get(i).idade;
				
			}if(habit.get(i).idade < menor){
				
				menor = habit.get(i).idade;
				
			}if(habit.get(i).sexo.equals("F") && habit.get(i).numFi > 2){
				
				mf++;
			}
		}
		
		ES.md("A menor idade é de: " + menor
	+ "\n" + "A maior idade é de: " + maior
	+ "\n" + "A quantidade de mulheres com mais de dois filhos é de: " + mf);
	}
	// . Calcule e mostre a média
		// de salários entre habitantes, a menor e a
		// maior idade do grupo e a quantidade de
		// mulheres com mais de dois filhos
}
class Habitt{
	int idade,numFi;
	double renda;
	String sexo;
}
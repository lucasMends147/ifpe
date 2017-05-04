package Registro_L;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class E_6 {

	public static void main(String[] args) {
		List <Aluno> aluno = new ArrayList <Aluno>();
		List <Double> mf = new ArrayList <Double>();
		
		for(int i = 0;i < 2;i++){
			Aluno aux = new Aluno ();
			
			aux.nome = ES.PS("Digite o nome do aluno :");
			aux.email = ES.PS("Digite o email do aluno :");
			aux.n1 = ES.PD(aux.n1, "Digite a primeira nota: ");
			aux.n2 = ES.PD(aux.n2, "Digite a segunda nota: ");
			
			aluno.add(aux);
		}
		String p = "";
		for(int i = 0;i < aluno.size();i++){
			mf.add((aluno.get(i).n1 + aluno.get(i).n2)/2);
			
		}
		
		for(int i = 0;i < mf.size() ;i++){
			p = p + "Aluno: " + aluno.get(i).nome + "\nMédia:  " + mf.get(i) + "\n" + "\n";
		}
		
		JOptionPane.showMessageDialog(null, p);
	}
	// 6. Fazer um registro para representar o
		// aluno com os seguintes dados: Nome, email,
		// Nota1 e Nota 2. Utilizar um array de
		// registros, fazer o cadastro de 30 alunos e mostrar
		// ao final um relatório com os alunos e a média das duas notas.
}
class Aluno{
	String nome;
	String email;
	double n1,n2;
}
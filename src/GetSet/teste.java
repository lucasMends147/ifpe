package GetSet;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import GetSet.test.GerenciaLivraria_7_2;
import heranca.ES;

public class teste {

	public static void main(String[] args) {
		int matricula = 0, op;
		String nome = "", endereço = "";
		double notas[] = new double[4];
		ArrayList <Estudante> arrayEst = new ArrayList<>();
		Estudante estudante = null;

		do {
			op = Integer.parseInt(JOptionPane
					.showInputDialog("Digite \n1. Criar um Estudante" + "\n2. Calcular Média (Se o Aluno foi Aprovado)"
							+ "\n3. Obter número de matricula" + "\n4. Obter Endereço" + "\n0. Sair"));

			switch (op) {

			case 1:
				estudante = new Estudante(nome, matricula, endereço, notas);

				estudante.setNome(ES.ler("Digite nome do aluno: "));
				estudante.setEndereço(ES.ler("Digite o endereço: "));
				estudante.setMatricula(ES.lerInt("Digite o numero da matricula"));
				arrayEst.add(estudante);
				
				for (int i = 0; i < notas.length; i++) {
					notas[i] = ES.lerDouble("Digite a nota");
				}
				break;
			case 2:

				if (estudante.media() >= 6) {

					ES.mostrar("A media é: " + estudante.media() + " Aprovado");

				}

				else {

					ES.mostrar(" A média é: " + estudante.media());

				}

				break;

			case 3:
				ES.md("O numero da matricula é: " + estudante.getMatricula());

				break;

			case 4:
				ES.md("O endereço é : " + estudante.getEndereço());

				break;

			case 0:

				break;
			default:

				ES.md("Opção Invalida!!");

				break;
			}
		} while (op != 0);

	}

}
import Registro_L.ES;
//Quest�o 01: Crie uma classe estudante. Esta classe deve ter nome, n�mero de
//matr�cula, endere�o, e 04 notas. Forne�a um construtor e m�todos para alterar e
//obter o nome do estudante e as notas. Al�m disso, crie um m�todo para calcular a
//m�dia do estudante. Crie outra classe que forne�a as seguintes op��es ao usu�rio:

public class AlunoMain {

	public static void main(String[] args) {
		int op = 10;
		String nome = "";
		String endereco= "";
		int matricula= 0;
		double [] nota = new double [4];
		Aluno al = null;
		do{	
			op = ES.PI(op, "Digite 1 para criar estudante"
					+ "\n" + "Digite 2 para calcular m�dia"
					+ "\n" + "Digite 3 para obter numero de matricula"
					+ "\n" + "Digite 4 para obter endere�o"
					+ "\n" + "Digte 0 para sair");
			
			switch(op){
			case 1:
			al = new Aluno(nome,endereco,matricula,nota);
			al.SetNome(ES.PS("Digite um nome: "));
			al.setEndereco(ES.PS("Digite um endere�o: "));
			al.setMatricula(ES.PI(matricula, "Digite a matricula:"));
			
			for(int i = 0;i < nota.length;i++){
				nota[i] = ES.PD(nota[i], "Digite a " + (i +1) + "� nota");
			}
			
				break;
			case 2:
				
				System.out.println("A m�dia � :"+ al.media());
				break;
				
			case 3:
				System.out.println("O n�mero da matricula �: " + al.getMatricula());
				break;
				
			case 4:
				System.out.println("O endere�o �: " + al.getEndereco());
				break;
				
			case 0:
				System.out.println("Adeus!");
				break;
				
			default:
				System.out.println("N�mero inv�lido!");
				break;
				
			}
		}while( op!= 0);
		
		
	}

}

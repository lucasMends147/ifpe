import Registro_L.ES;
//Questão 01: Crie uma classe estudante. Esta classe deve ter nome, número de
//matrícula, endereço, e 04 notas. Forneça um construtor e métodos para alterar e
//obter o nome do estudante e as notas. Além disso, crie um método para calcular a
//média do estudante. Crie outra classe que forneça as seguintes opções ao usuário:

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
					+ "\n" + "Digite 2 para calcular média"
					+ "\n" + "Digite 3 para obter numero de matricula"
					+ "\n" + "Digite 4 para obter endereço"
					+ "\n" + "Digte 0 para sair");
			
			switch(op){
			case 1:
			al = new Aluno(nome,endereco,matricula,nota);
			al.SetNome(ES.PS("Digite um nome: "));
			al.setEndereco(ES.PS("Digite um endereço: "));
			al.setMatricula(ES.PI(matricula, "Digite a matricula:"));
			
			for(int i = 0;i < nota.length;i++){
				nota[i] = ES.PD(nota[i], "Digite a " + (i +1) + "º nota");
			}
			
				break;
			case 2:
				
				System.out.println("A média é :"+ al.media());
				break;
				
			case 3:
				System.out.println("O número da matricula é: " + al.getMatricula());
				break;
				
			case 4:
				System.out.println("O endereço é: " + al.getEndereco());
				break;
				
			case 0:
				System.out.println("Adeus!");
				break;
				
			default:
				System.out.println("Número inválido!");
				break;
				
			}
		}while( op!= 0);
		
		
	}

}

package heranca2;

import heranca.ES;

public class teste {
//	Exerc�cio 5: Crie uma classe de Teste com o m�todo main. Neste m�todo:
//		a. crie um assistente administrativo e um t�cnico. Imprima o n�mero de matr�cula e o
//		nome de cada um deles.
//		

	public static void main(String[] args) {
		String nome = "",endereco = "",turno = "";
		long cpf = 0;
		int numMatricula = 0;
		double adicional = 0 ,salario = 0;
		char opcao = ' ';
		int pede = 0;
		double preco = 2800;
		
		switch(opcao){
		case 'a':
			
			AssistenteAdministrativo assistAdm = new AssistenteAdministrativo(nome,cpf,salario,
					 endereco, numMatricula, turno, adicional);
			
			AssistenteTecnico assistTec = new AssistenteTecnico(nome,cpf,
					salario,endereco,numMatricula);
			
			
			assistAdm.setNome(ES.PS("Digite o nome do assistente administrativo :"));
			assistAdm.setNumMatricula(ES.PI("Digite o n�mero da matricula :"));
			
			
			assistTec.setNome(ES.PS("Digite o nome do assistente tecnico: "));
			assistTec.setNumMatricula(ES.PI("DIgite o n�mero da matricula :"));
			
			System.out.println("Nome do assistente Administrativo " + assistAdm.getNome() + "\n"
					+ "N�mero da matr�cula : " + assistAdm.getNumMatricula());
			
			System.out.println("Nome do assistente t�cnico : " + assistTec.getNome() + "\n"
					+ "N�mero da matr�cula : " + assistTec.getNumMatricula());
			
			break;
			
		case 'b':
			String raca = "";
			Cachorro donguinho = new Cachorro(nome,raca);
			donguinho.setNome("Nymeria");
			donguinho.setRaca("Dire wolf");
			donguinho.caminha();
			donguinho.late();
			
			Gato foba = new Gato(nome,raca);
			foba.setNome("Foba");
			foba.setRaca("Sphynx");
			foba.caminha();
			foba.mia();
			
//			b. crie um animal do tipo cachorro e fa�a-o latir. Crie um gato e fa�a-o miar. Fa�a os
//			dois animais caminharem.
			break;
			
		case 'c':
			
//			c. teste (como quiser) as classes Rica, Pobre e Miseravel.
			break;
			
		case 'd':
			 pede = ES.PI("Digite 1 para ingresso normal e 2 para vip ");
			
			switch(pede){
			case 1:
				Ingresso aux = new Ingresso();
				aux.imprimeValor();
				
				break;
				
			case 2:
				pede = 0;
				pede = ES.PI("Digite 1 para camarote superior e 2 para inferior: ");
				if(pede == 1){
					double valor = 150;
					
					CamaroteSuperior cs = new CamaroteSuperior();
					cs.retornaValor();
					
				}else if(pede == 2){
					String local = "Arena hall";
					
					double valor = 115;
					CamaroteInferior ci = new CamaroteInferior(local);
					System.out.println("O local �: " + ci.getLocal());
					ci.imprimeValor();
					
				}
			}
//		d. crie um ingresso. Pe�a para o usu�rio digitar 1 para normal e 2 para VIP.
//		Conforme a escolha do usu�rio, diga se o ingresso � do tipo normal ou VIP. Se for
//		VIP, pe�a para ele digitar 1 para camarote superior e 2 para camarote inferior.
//		Conforme a escolha do usu�rio, diga se que o VIP � camarote superior ou inferior.
//		Imprima o valor do ingresso.
			break;
			
		case 'e':
			pede = ES.PI("Digite 1 para im�vel novo e 2 para im�vel velho: ");
			
			switch (pede){
			case 1:
				
				adicional = 1500;
					Novo imovel = new Novo (endereco,preco,adicional);
					System.out.println(imovel.novoPreco());
					
				break;
				
			case 2:
				double desconto = 700;
				Velho imove = new Velho(endereco,preco,desconto);
				System.out.println(imove.precoDesconto());
				break; 
			}
//		e. crie um im�vel. Pe�a para o usu�rio digitar 1 para novo e 2 para velho. Conforme a
//		defini��o do usu�rio, imprima o valor final do im�vel.
			break;
			
			default:
				System.out.println("Inv�lido!");
		}
		
		

	}

}

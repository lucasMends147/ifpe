package heranca2;

import heranca.ES;

public class teste {
//	Exercício 5: Crie uma classe de Teste com o método main. Neste método:
//		a. crie um assistente administrativo e um técnico. Imprima o número de matrícula e o
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
			assistAdm.setNumMatricula(ES.PI("Digite o número da matricula :"));
			
			
			assistTec.setNome(ES.PS("Digite o nome do assistente tecnico: "));
			assistTec.setNumMatricula(ES.PI("DIgite o número da matricula :"));
			
			System.out.println("Nome do assistente Administrativo " + assistAdm.getNome() + "\n"
					+ "Número da matrícula : " + assistAdm.getNumMatricula());
			
			System.out.println("Nome do assistente técnico : " + assistTec.getNome() + "\n"
					+ "Número da matrícula : " + assistTec.getNumMatricula());
			
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
			
//			b. crie um animal do tipo cachorro e faça-o latir. Crie um gato e faça-o miar. Faça os
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
					System.out.println("O local é: " + ci.getLocal());
					ci.imprimeValor();
					
				}
			}
//		d. crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP.
//		Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP. Se for
//		VIP, peça para ele digitar 1 para camarote superior e 2 para camarote inferior.
//		Conforme a escolha do usuário, diga se que o VIP é camarote superior ou inferior.
//		Imprima o valor do ingresso.
			break;
			
		case 'e':
			pede = ES.PI("Digite 1 para imóvel novo e 2 para imóvel velho: ");
			
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
//		e. crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho. Conforme a
//		definição do usuário, imprima o valor final do imóvel.
			break;
			
			default:
				System.out.println("Inválido!");
		}
		
		

	}

}

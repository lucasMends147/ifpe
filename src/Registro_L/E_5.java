package Registro_L;

import java.util.ArrayList;
import java.util.List;

public class E_5 {

	public static void main(String[] args) {
		List <Clientt> cliente = new ArrayList <Clientt>();

		for(int i = 0; i < 2 ;i++){
			Clientt caux = new Clientt();
			
			caux.nome = ES.PS
					("Digite o nome do cliente: ");
			
			caux.endereco = ES.PS
					("Digite o endereço : ");
			
			caux.telefone = ES.PL
					(caux.telefone, "Digite o telefone: ");
			
			caux.codigo = ES.PL
					(caux.codigo, "Digite o codigo do cliente: ");
 			
			cliente.add(caux);
		}int code = 0,cont = 0;
		do{
			code = ES.PI
					(code, "Digite um código para pesquisar,ou 999 para sair; ");
			
				for(int i = 0;i < cliente.size();i++){
					
					if(code == cliente.get(i).codigo){
						
						ES.md
						(""+ cliente.get(i).nome);
						
						break;
					}else if(code != cliente.get(i).codigo){
						
						cont++;
					}if(cont == cliente.size() && code != 999){
						
						ES.md
						("Código não existe,tente novamente ou digite 999 ");
						break;
					}
				}
			cont = 0;
		}while(code != 999);
		ES.md("Adeus!");
	}

}
class Clientt{
	String nome;
	String endereco;
	long telefone;
	long codigo;
	
}
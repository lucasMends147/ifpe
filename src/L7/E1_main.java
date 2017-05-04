package L7;

import java.util.ArrayList;
import java.util.List;

import heranca.ES;

public class E1_main {
	public static void main(String[] args) {
		List <Livro> listLivro = new ArrayList<>();
		String autor = "",editora = "",titulo = "";
		int isbn = 0,opcao = 0;
		double anoEdicao = 0;
		boolean ver = true;
		Livro laux = null;
		
		do{
			opcao = ES.PI("Digite 1 para cadastrar livro \n2.Para buscar livro(por titulo)"
					+ "\n3.Para listar livros do autor \n4.Listar todos os livros \n0.Sair");
			
			switch(opcao){
			case 1:
				laux = new Livro (autor,editora,isbn,titulo,anoEdicao);
				laux.setAnoEdicao(ES.PD("Digite o ano de edição no formato dd.mm.aa;"));
				laux.setAutor(ES.PS("Digite o nome do autor;"));
				laux.setEditora(ES.PS("DIgite o nome da editora;"));
				laux.setIsbn(ES.PI("Digite o código ISBN"));
				laux.setTitulo(ES.PS("Digite o nome do titulo;"));
				
				listLivro.add(laux);
				break;
				
			case 2:
				String procura = "";
				
				procura = ES.PS("Digite o nome do título a ser buscado;");
				
				for(int i = 0;i < listLivro.size();i++){
					if(listLivro.get(i).getTitulo().equals(procura)){
						ES.md("O livro " + procura + " tem o autor " + listLivro.get(i).getAutor()
								+ "\nA editora é " + listLivro.get(i).getEditora() + " e seu ano de edição é "
								+ listLivro.get(i).getAnoEdicao());
					}else if(listLivro.equals(i)){
						ES.md("Livro não consta!");
					}
				}
				procura = "";
				break;
				
			case 3:
				procura = ES.PS("Digite o nome do autor;");
				String nomes = "";
				for(int i = 0;i < listLivro.size();i++){
					if(procura.equals(listLivro.get(i).getAutor())){
						nomes += "Livro " + listLivro.get(i).getTitulo() + 
								" do autor " + listLivro.get(i).getAutor() + "\n";
					}
				
				}
				ES.md(nomes);
				break;
				
			case 4:
				String todos = "";
				for(int i = 0;i < listLivro.size();i++){
					todos += listLivro.get(i).getTitulo() + " Autor: " + listLivro.get(i).getAutor() + "\n";
				}
				ES.md(todos);
				break;
				
			case 0:
				ES.md("Adeus!");
				ver = false;
			
				break;
				
			default:
				ES.md("Opção inválida,tente de novo!");
				
			}
			
		}while(ver == true);
	}

}

package GetSet;

import java.util.ArrayList;

import heranca.ES;

public class GerenciaLivraria_main_7_2 {

		public static void main(String[] args) {
			String MostraQuantidade = "";
			String produto;
			String cont3 = "";
			String mostra = "";
			String NomeProd;
			String nome;
			double preco;
			int codigo, quant;
			int op;
			int cont;
			cont = -1;
			int quantProd;

			GerenciaLivraria_7_2 aux = null;
			ArrayList<GerenciaLivraria_7_2> gerencia = new ArrayList<>();

			do {

				op = ES.PI("1. Cadastrar produto \n2. Buscar produto(procurar produto pelo nome)"
						+ "\n3. Listar todos os produtos \n4. Efetuar venda de produtos \n0. Sair");

				switch (op) {

				case 1:

					nome = ES.PS("Nome");
					preco = ES.PD("Preço:");
					codigo = ES.PI("Codigo");
					quant = ES.PI("Quantidade:");
					aux = new GerenciaLivraria_7_2(nome,codigo,preco,quant);
					gerencia.add(aux);
					
					break;

				case 2:

					NomeProd = ES.PS("Nome do produto:");

					for (int i = 0; i < gerencia.size(); i++) {
						if (gerencia.get(i).getNome().equalsIgnoreCase(NomeProd)) {

							System.out.println("Produto " + gerencia.get(i).getNome() + "\nPreço:"
									+ gerencia.get(i).getPreco() + "\nCodigo do produto:" + gerencia.get(i).getCodigo()
									+ "\nQuantidade do produto: " + gerencia.get(i).getQuant());
							cont = i;
							break;
						}
					}
					if (cont == -1) {
						System.out.println("não tem");
					}
					break;

				case 3:

					for (int i = 0; i < gerencia.size(); i++) {
						mostra += "Produto " + gerencia.get(i).getNome() + "\nPreço:" + gerencia.get(i).getPreco()
								+ "\nCodigo do produto:" + gerencia.get(i).getCodigo() + "\nQuantidade do produto: "
								+ gerencia.get(i).getQuant() + "\n\n";
					}
					System.out.println(mostra);
					break;

				case 4:
				
					produto = ES.PS("Digite o produto que deseja comprar");

					for (int i = 0; i < gerencia.size(); i++) {
						if (gerencia.get(i).getNome().equalsIgnoreCase(produto)) {
							
							quantProd = ES.PI("Digite a quantidade que deseja comprar:");
							
							if (gerencia.get(i).getQuant() <= 0) {
								
								System.out.println("Não tem mais este produto!!");
								break;

							}
							if (gerencia.get(i).getQuant() > 0) {
								
								gerencia.get(i).setQuant(gerencia.get(i).getQuant() - quantProd);
								cont3 += ("Você comprou  " +quantProd + "  "+gerencia.get(i).getNome()) + "\n";
								cont = i;
								ES.md(cont3);
								cont3 = "";
								break;
								
							}
						}
						
					}
					if (cont == -1) {
						System.out.println("Produto inválido !");
					}

					break;

				case 0:

					break;

				default:
					System.out.println("Opção inválida!!");
					break;

				}
			} while (op != 0);
		}

	}

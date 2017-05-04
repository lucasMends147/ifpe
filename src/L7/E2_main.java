package L7;

import java.util.ArrayList;
import java.util.List;

import heranca.ES;

public class E2_main {
	public static void main(String[] args) {
		List<Produto> listProduto = new ArrayList<>();
		String nome = "";
		int opcao = 0, codigo = 0, quantidade = 0;
		double preco = 0;
		boolean ver = true;
		Produto paux = null;

		do {
			opcao = ES.PI("Digite para cadastrar o produto \n2.Para buscar produto(nome "
					+ "\n3.Listar todos os produtos \n4.Efetuar uma venda \n0.Sair");

			switch (opcao) {
			case 1:
				paux = new Produto(nome, codigo, preco, quantidade);

			
				paux.setNome(ES.PS("Digite o nome do produto;"));
				paux.setCodigo(ES.PI("Digite o codigo;"));
				paux.setPreco(ES.PD("Digite o preço do produto;"));
				paux.setQuantidade(ES.PI("Digite a quantidade do produto;"));

				listProduto.add(paux);
				break;

			case 2:
				String procura = "";
				procura = ES.PS("Digite o nome a ser buscado;");

				for (int i = 0; i < listProduto.size(); i++) {
					if (procura.equals(listProduto.get(i).getNome())) {
						  ES.md("O produto " + procura + " tem o código "
						  +listProduto.get(i).getCodigo() + "\nQuantidade : " +
						  listProduto.get(i).getQuantidade() + "\nPreço: " + "\n");
					
						break;
					}
					
				}
				break;

			case 3:
				String vf = "";
				for (int i = 0; i < listProduto.size(); i++) {
					vf += "O produto " + listProduto.get(i).getNome() + " tem o código "
							+ listProduto.get(i).getCodigo() + "\nQuantidade : " + listProduto.get(i).getQuantidade()
							+ "\nPreço: " + listProduto.get(i).getPreco() + "\n";
				}
				ES.md(vf);
				break;

			case 4:
				String procuraNome = ES.PS("Digite o nome do produto a ser vendido; ");
				int quant = ES.PI("Digite a quantidade de produtos a serem comprados ;");
				
				for (int i = 0; i < listProduto.size(); i++) {
					listProduto.get(i).venda(procuraNome, quant);
				}
				break;

			case 0:
				ES.md("Adeus!");
				ver = false;
				break;

			default:
				ES.md("Inválido,tente novamente! ");
			}

		} while (ver == true);

	}

}

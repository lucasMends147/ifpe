package Registro_L;

import java.util.ArrayList;
import java.util.List;

public class E_4 {
	
	public static void main(String[] args) {
		List <Produto> produto = new ArrayList <Produto>();
		
		for(int i = 0 ;i < 2;i++){
			Produto paux = new Produto();
			
			paux.codigo = ES.PI(paux.codigo, "Digite o codigo do produto: ");
			paux.nome = ES.PS("Digite o nome do produto: ");
			paux.quant = ES.PI(paux.quant, "Digite a quantidade do produto: ");
			paux.preco = ES.PD(paux.preco, "Digite o preço do produto: ");
			
			produto.add(paux);
		}
		String p = "";
		for(int i = 0;i < produto.size();i++){
			if(produto.get(i).quant > 7){
				p = p + "Nome:  " + produto.get(i).nome 
				+ "\nQuantidade : " + produto.get(i).quant 
				+ "\nPreco:  " + produto.get(i).preco + "\n";
			}

		}
		System.out.println(p);
	}

}
class Produto{
	int codigo;
	String nome;
	int quant;
	double preco;
	
}
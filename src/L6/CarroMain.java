package L6;

import javax.swing.JOptionPane;

import Registro_L.ES;

public class CarroMain {
	public static void main(String[] args) {
		int opcao = 0;
		boolean ver = true;
		double combustivel = 0;
		double distancia = 0;
		double eficiencia = 0;
		Carro fusca = null;
		double quilometragem = 0;
		double tanque = 0;
		//Criação do carro
		{
			fusca = new  Carro(tanque,eficiencia,quilometragem,combustivel);
			
			fusca.setTanque(Double.parseDouble
					(JOptionPane.showInputDialog("Digite a capacidade do tanque;")));
			
			fusca.setEficiencia(Double.parseDouble
					(JOptionPane.showInputDialog("Digite a eficiencia do carro;")));
			
			fusca.setQuilometragem(Double.parseDouble
					(JOptionPane.showInputDialog("Digite a quilometragem;")));;
					
			fusca.setCombustivel(Double.parseDouble
					(JOptionPane.showInputDialog("Digite a quantidade de combustível ;")));
			
			combustivel =  fusca.verifica();
					
			fusca.abastecer(combustivel);
		}
			
		
		do{
			opcao = ES.PI(opcao, "Digite 1 para andar \n 2.Para abastecer \n 3.Para verificar combustível"
					+ "\n4.Para acabar a viagem \n5.Para começar uma nova viagem");
			switch(opcao){
			case 1:
				distancia = Double.parseDouble
						(JOptionPane.showInputDialog("Digite a distancia a ser percorrida"));
				
				fusca.andar(distancia);
				
				break;
				
			case 2:
				combustivel = Double.parseDouble
						(JOptionPane.showInputDialog("Digite a quantidade de combustível ;"));
				
				fusca.abastecer(combustivel);
				break;
				
			case 3:
				ES.md("A quantidade restante é de :" + fusca.verifica());
				break;
				
			case 4:
				ES.md("Adeus!");
				ver = false;
				break;
				
			case 5:
				
				ES.md("Digite os valores para o novo carro e nova viagem : ");
				
				fusca.setTanque(Double.parseDouble
						(JOptionPane.showInputDialog("Digite a capacidade do tanque;")));
				
				fusca.setEficiencia(Double.parseDouble
						(JOptionPane.showInputDialog("Digite a eficiencia do carro;")));
				
				fusca.setQuilometragem(Double.parseDouble
						(JOptionPane.showInputDialog("Digite a quilometragem;")));;
						
				fusca.setCombustivel(Double.parseDouble
						(JOptionPane.showInputDialog("Digite a quantidade de combustível ;")));
				
				combustivel =  fusca.verifica();
						
				fusca.abastecer(combustivel);
				break;
				
			}
		}while(ver == true);

	}

}

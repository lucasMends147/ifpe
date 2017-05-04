import heranca.ES;

public class CirculoMain {
//	1. Criar um círculo (Digitar valor de r)
//	2. Calcular Área
//	3. Calcular Perímetro
//	0. Sair 
	public static void main(String[] args) {
		double r = 0;
		Circulo c = null;
		int op = 10;
		
		do{
			op = ES.PI(op, "Digite 1 para criar o circulo"
					+ "\n" + "Digite 2 para calcular a area"
					+ "\n" + "Digite 3 para calcular o perimetro"
					+ "\n" + "Digite 0 para sair" );
			
			switch(op){
			case 1:
				c = new Circulo (r);
				c.setR(ES.PD(r, "Digite o valor do raio: "));
				break;
				
			case 2:
				System.out.println("O valor da area é de: " + c.area());
				break;
				
			case 3:
				System.out.println("O valor do perimetro é de: "+ c.perimetro());
				break;
			
			case 0:
				System.out.println("Adeus!");
				break;
			default:
				System.out.println("Número inválido,tente de novo!");
				break;
			}
		}while(op !=0);

	}

}

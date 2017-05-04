import Registro_L.ES;

public class RetanguloMain {
 
	public static void main(String[] args) {
		double base = 0;
		double altura= 0;
		Retangulo rt = null;
		int op = 7;
		
		do{
			op = ES.PI(op, "Digite 1 para criar um retangulo (dgitar valor de base a altura)" 
					+ "\n" + "Digite 2 para calcular áera "
					+ "\n" + "Digite 3 para calcular perímetro"
					+ "\n" + "Digite 0 para sair.");
			
			switch(op){
			case 1:
				rt = new Retangulo (base,altura);
				rt.setAltura(ES.PD(altura, "Digite a altura do retangulo: "));
				rt.setBase(ES.PD(base, "Digite a base do retangulo: "));
				break;
				
			case 2:
				System.out.println("O valor da área é de:" + rt.area());
				break;
				
			case 3:
				System.out.println("O valor do perimetro é de :" + rt.perimetro());
				break;
				
			case 0:
				System.out.println("Adeus!");
				break;
				
			default:
				System.out.println("Valor inválido!");
				break;
			}
		}while(op!= 0);
		
	}
}

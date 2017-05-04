import Registro_L.ES;

public class RetanguloMain {
 
	public static void main(String[] args) {
		double base = 0;
		double altura= 0;
		Retangulo rt = null;
		int op = 7;
		
		do{
			op = ES.PI(op, "Digite 1 para criar um retangulo (dgitar valor de base a altura)" 
					+ "\n" + "Digite 2 para calcular �era "
					+ "\n" + "Digite 3 para calcular per�metro"
					+ "\n" + "Digite 0 para sair.");
			
			switch(op){
			case 1:
				rt = new Retangulo (base,altura);
				rt.setAltura(ES.PD(altura, "Digite a altura do retangulo: "));
				rt.setBase(ES.PD(base, "Digite a base do retangulo: "));
				break;
				
			case 2:
				System.out.println("O valor da �rea � de:" + rt.area());
				break;
				
			case 3:
				System.out.println("O valor do perimetro � de :" + rt.perimetro());
				break;
				
			case 0:
				System.out.println("Adeus!");
				break;
				
			default:
				System.out.println("Valor inv�lido!");
				break;
			}
		}while(op!= 0);
		
	}
}

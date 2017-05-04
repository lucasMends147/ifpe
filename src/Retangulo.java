public class Retangulo {
	private double altura;
	private double base;
	
	public Retangulo(double base,double altura){
		this.base = base;
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	public double area(){
		double vf = 0;
		return vf = this.altura * this.base;
	}
	public double perimetro(){
		double vf = 0;
		return vf = (this.altura * 2) + (this.base * 2);
	}
}

public class Circulo {
	double r;
	
	public Circulo(double r){
		this.r = r;
	}
	public double getR(){
		return this.r;
	}
	public void setR(double r){
		this.r = r;
	}
	
	public double area(){
		double area = 0;
		area = this.r * Math.PI;
		return area = Math.pow(area, 2);
	}
	public double perimetro(){
		double perimetro = 0;
		return perimetro = 2 * Math.PI * r;
	}
}
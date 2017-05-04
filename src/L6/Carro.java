package L6;

import heranca.ES;

public class Carro {
	private double tanque;
	private double eficiencia;
	private double quilometragem;
	private double combustivel;
	
	public Carro(double tanque,double eficiencia,double quilometragem,double combustivel){
		this.tanque = tanque;
		this.eficiencia = eficiencia;
		this.quilometragem = quilometragem;
		this.combustivel = combustivel;
		
	}
	
	public Carro(){
		this(0 , 1 , 0, 0);
		
	}
	public double getTanque(){
		return tanque;
	}
	public void setTanque(double tanque){
		this.tanque = tanque;
		
	}
	
	
	public void setEficiencia(double eficiencia){
		this.eficiencia = eficiencia;
	}
	
	
	public void setQuilometragem(double quilometragem){
		this.quilometragem = quilometragem;
		
	}
	public void setCombustivel(double combustivel){
		this.combustivel = combustivel;
	}
	
	
	public void andar(double distancia){
			this.combustivel *= this.eficiencia / distancia;
			ES.md("Andei " + distancia);
			
		 if(this.tanque == 0){
			ES.md("Vázio,coloque combustivel! ");
		}else if(this.combustivel < distancia){
			ES.md("Não é possível fazer essa viagem,abasteça o veículo");
		}
	}
	
	public void abastecer(double combustivel){
		
		if(getTanque() < combustivel ){
			ES.md("Tais doido macho,vai derramar; "); 
		}
		else{
			this.combustivel += combustivel;
		}
	}
	public double verifica(){
		return this.combustivel;
	}
}

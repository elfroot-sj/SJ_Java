package _05_Abstract;

public class Cerchio extends Forma{
	private double raggio;

	
//faccio il costruttore
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	@Override
	public double calcolaArea() {
		return raggio*raggio*Math.PI; //PI è pi greca che Java ha già disponibile
	}

	@Override
	public double calcolaPerimetro() {
		return raggio*2*Math.PI;
	}
	
}

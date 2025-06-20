package _05_Abstract;

public class Rettangolo extends Forma{
	private double base;
	private double altezza;
	
	//questa volta il costruttore mi serve
	public Rettangolo(double base, double altezza) {
		this.base=base;
		this.altezza=altezza;
	}
	
	@Override
	public double calcolaArea() {
		return base*altezza;
	}
	
	@Override
	public double calcolaPerimetro() {
		return base*2+altezza*2;
	}
	
	
}

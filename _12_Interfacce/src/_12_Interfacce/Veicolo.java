package _12_Interfacce;

public abstract class Veicolo {
	public int batteria;

	//costruttore
	public Veicolo(int batteria) {
		this.batteria = batteria;
	}

	@Override
	public String toString() {
		return "Veicolo [batteria=" + batteria + "]";
	}
	
	
}

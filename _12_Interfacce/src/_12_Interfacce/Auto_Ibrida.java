package _12_Interfacce;

public class Auto_Ibrida extends Veicolo implements Ricaricabile, Connettività { //così implementiamo le due interfacce
	boolean connected;
	
	//costruttore
	public Auto_Ibrida(int batteria) {
		super(batteria);
		this.connected = false;
	}


	@Override
	public void connetti() {
		System.out.println("Bluetooth connesso");
		this.connected = true;
		
	}

	@Override
	public void disconnetti() {
		System.out.println("Bluetooth disconnesso");
		this.connected = false;
	}

	@Override
	public boolean isConnesso() {
		return this.connected;
	}

	@Override
	public void ricarica() {
		batteria = 100; //abbiamo caricato la batteria
		
	}
	
}

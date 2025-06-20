package _06_Animali;

public class Main {
	public static void main(String[] args) {
		
		//creo un oggetto della classe rifugio che conterrà la lista degli animali (inizialmente vuota)
		Rifugio rifugio = new Rifugio();

		//creo gli animali
		Animale cane1 = new Cane("Tosca");
        Animale gatto1 = new Gatto("Pepe");
        Animale cane2 = new Cane("Pickles");
        Animale gatto2 = new Gatto("Carla");

        //aggiungo gli animali al rifugio
        rifugio.aggiungiAnimale(cane1);
        rifugio.aggiungiAnimale(gatto1);
        rifugio.aggiungiAnimale(cane2);
        rifugio.aggiungiAnimale(gatto2);
        
        
        rifugio.stampaVersi();
	
	
	
	}
}

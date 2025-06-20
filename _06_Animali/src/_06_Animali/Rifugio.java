package _06_Animali;
import java.util.ArrayList;

public class Rifugio {
	
	
	ArrayList<Animale> animali = new ArrayList<Animale>();
	
	public void aggiungiAnimale(Animale a) {
        animali.add(a);
    }

    public void stampaVersi() {
        for (Animale a : animali) {
            a.descrizione();  // Mostra il nome dell'animale
            a.emettiVerso();  // Mostra il verso specifico
        }
    }
}

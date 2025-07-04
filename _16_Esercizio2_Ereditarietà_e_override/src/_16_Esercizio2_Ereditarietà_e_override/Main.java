package _16_Esercizio2_Ereditarietà_e_override;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Studente stud1 = new Studente("Virginia", "Woolf", "Y54000258");
		Professore prof1 = new Professore("William", "Turner", "Arte");
		Persona persona1 = new Persona("Mario", "Rossi");
		
		ArrayList<Persona> persone = new ArrayList<>();
		persone.add(stud1);
		persone.add(prof1);
		persone.add(persona1);
		
		for(Persona i : persone) {
			i.presentati();
		}
		
	}
}

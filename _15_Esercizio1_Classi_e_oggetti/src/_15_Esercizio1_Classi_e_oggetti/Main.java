package _15_Esercizio1_Classi_e_oggetti;

public class Main {
	public static void main(String[] args) {
		Studente student1 = new Studente("Anna", "Pace", 2004);
		Studente student2 = new Studente("Giuseppe", "Cardacino", 1997);
		
		student1.stampaScheda();
		student2.stampaScheda();
	}
}

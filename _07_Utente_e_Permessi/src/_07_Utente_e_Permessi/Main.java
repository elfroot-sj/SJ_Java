package _07_Utente_e_Permessi;

public class Main {
	public static void main(String[] args) {
		//creo un oggetto della classe GestioneUtenti che al suo interno ha una lista di utenti
		GestioneUtenti sistema = new GestioneUtenti();
		
		//creo admin e clienti
		
		Utente admin1 = new Admin("Temistocle (Admin) - ", "temi@email.com");
		Utente admin2 = new Admin("Giulia (Admin) - ", "giulia@email.com");
		
		Utente cliente1 = new Cliente("Alessandro (Cliente) - ", "alex@email.com");
		Utente cliente2 = new Cliente("Demetra (Cliente) - ", "demetra@email.com");
		
		//aggiungo questi utenti al sistema
		sistema.aggiungiUtente(admin1);
		sistema.aggiungiUtente(admin2);
		sistema.aggiungiUtente(cliente1);
		sistema.aggiungiUtente(cliente2);
		
		//stampo info e permessi
		System.out.println("Info e permessi");
		sistema.stampaPermessi();
	}

}

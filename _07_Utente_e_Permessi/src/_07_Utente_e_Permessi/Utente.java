package _07_Utente_e_Permessi;

import java.util.ArrayList;

public abstract class Utente {
	private String username;
	private String email;

	//costruttore
	public Utente(String username, String email) {
		this.username = username;
		this.email = email;
	}
	
	//metodo astratto getPermessi() che restituisce una lista di permessi (come ArrayList<String>)
	public abstract ArrayList<String> getPermessi();

	public void stampaInfo() {
		System.out.println("Username: " + username + "E-mail: " + email);
	}
	
	
	
}

package _16_Esercizio2_Ereditarietà_e_override;

public class Persona {
	String nome;
	String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public void presentati() {
		System.out.println("Ciao, sono " + nome + " " + cognome);
	}
	
	
	
}

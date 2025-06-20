package _06_Animali;

public abstract class Animale {
	String nome;
	
	public abstract void emettiVerso();
	public void descrizione() {
		System.out.println("Sono un animale di nome " +nome);
		
	}
}

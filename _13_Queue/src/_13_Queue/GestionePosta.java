package _13_Queue;

public class GestionePosta { 
	public static void main(String[] args) {
		Posta posta = new Posta();
		Persona p1 = new Persona("Bach"); //prima creo l'oggetto, poi lo passo in ingresso alla coda
		Persona p2 = new Persona("Chopin");
		Persona p3 = new Persona("Shubert");
		Persona p4 = new Persona("Listz");
		
		//aggiungo persone alla coda
		posta.entraInCoda(p1);
		posta.entraInCoda(p2);
		posta.entraInCoda(p3);
		posta.entraInCoda(p4);
		
		System.out.println("Coda: ");
		//mostra la coda
		posta.mostraCoda();
		
		System.out.println("\nIl prossimo: ");
		//peek mostra il prossimo (il primo della fila) senza rimuoverlo
		System.out.println(posta.ilProssimo().getNome());
		
		System.out.println("\nSi servono due clienti: ");
		//servo due clienti
		System.out.println(posta.servireIlProssimo().getNome()); //getNome ritorna una Persona (cfr classe Persona) 
		System.out.println(posta.servireIlProssimo().getNome());
		
		System.out.println("\nCoda rimanente: ");
		//mostra la coda rimanente
		posta.mostraCoda();
	}

}

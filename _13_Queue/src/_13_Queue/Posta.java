package _13_Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Posta {
	public Queue<Persona> coda = new LinkedList<Persona>();
	
	
	public void entraInCoda(Persona p) {
		coda.add(p);
	}
	
	public Persona ilProssimo() {
		return coda.peek();
		
	}
	
	public Persona servireIlProssimo() {
		return coda.poll();
	}
	
	
	public void mostraCoda() {
		for(Persona i : coda) {
			System.out.println("- " + i.getNome());
		}
	}
}

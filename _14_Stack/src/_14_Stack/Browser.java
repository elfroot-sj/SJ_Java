package _14_Stack;
import java.util.Stack;

public class Browser {
	Stack<String> history = new Stack<String>(); //String perché è il tipo di ciò che contiene lo Stack 
	
	public void visitPage(String url) { //aggiunge l'url della nuova pagina allo stack
		history.add(url);
	}
	
	public void goBack() { //rimuove l'ultima pagina visitata e mostra la pagina precedente
		try { 
			history.pop(); //rimuove e restituisce l’elemento in cima alla fila/stack
		}catch (Exception e) {
			System.out.println("Nessuna pagina precedente.");
		}
	}
	
	public void printHistory() { //Stampa la cronologia delle pagine visitate (dal più recente al meno recente)
		System.out.println("Cronologia: ");
		for(String i : history) {
			System.out.println(i);
		}
	}
}

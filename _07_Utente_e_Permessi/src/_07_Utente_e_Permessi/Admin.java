package _07_Utente_e_Permessi;
import java.util.ArrayList;

public class Admin extends Utente {

	public Admin(String username, String email) {
		super(username, email);
		
	}

	
	@Override
	public ArrayList<String> getPermessi() {
		ArrayList<String> permessi = new ArrayList<>();
		//posso omettere String in ArrayList<> perchè a sinistra è già chiaro (da Java7+)
		permessi.add("READ");
		permessi.add("WRITE");
		permessi.add("DELETE");
		
		return permessi; //restituisce i permessi "READ", "WRITE", "DELETE"
	}
	

}

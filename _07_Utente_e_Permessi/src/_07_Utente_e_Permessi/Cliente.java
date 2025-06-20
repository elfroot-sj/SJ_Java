package _07_Utente_e_Permessi;
import java.util.ArrayList;

public class Cliente extends Utente{
	
	public Cliente(String username, String email) {
		super(username, email);
		
	}

	@Override
	public ArrayList<String> getPermessi() {
		ArrayList<String> permessi = new ArrayList<>();
		
		permessi.add("READ");
		
		return permessi; //ritorna solo READ
	}

}

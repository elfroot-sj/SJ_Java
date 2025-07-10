package _17_Esercizio3_SistemaDiAutenticazioneUtenti;

public class Professore extends Utente implements Autenticabile {
	String materia;

	public Professore(String username, String email, String materia) {
		super(username, email);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public void autentica(String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getUsername();
	}

	@Override
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		super.setUsername(username);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

	@Override
	public void presentati() {
		// TODO Auto-generated method stub
		super.presentati();
	}
	
	
}

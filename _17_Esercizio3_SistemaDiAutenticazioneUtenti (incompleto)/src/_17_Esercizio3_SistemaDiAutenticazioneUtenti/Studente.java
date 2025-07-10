package _17_Esercizio3_SistemaDiAutenticazioneUtenti;

public class Studente extends Utente implements Autenticabile{
	private String matricola;

	public Studente(String username, String email, String matricola) {
		super(username, email);
		this.matricola = matricola;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

    @Override
    public void autentica(String password) throws AutenticazioneException {
        if (!"studente123".equals(password)) {
            throw new AutenticazioneException("Password errata per lo studente " + getUsername());
        }
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
		System.out.println("Studente: " + getUsername() + "Matricola: " + matricola);
	}
	
	
}

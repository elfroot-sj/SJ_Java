package _17_Esercizio3_SistemaDiAutenticazioneUtenti;

public class AutenticazioneException extends Exception {
    private static final long serialVersionUID = 1L;

	public AutenticazioneException(String messaggio) {
        super(messaggio);
    }
}

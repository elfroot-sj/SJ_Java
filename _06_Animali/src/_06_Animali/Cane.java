package _06_Animali;

public class Cane extends Animale {
	//non scrivo String nome perché lo ha ereditato da Animale

    public Cane(String nome) {
        this.nome = nome;
    }

    @Override
    public void emettiVerso() {
        System.out.println("Bau!");
    }
}


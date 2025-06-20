package _06_Animali;

public class Gatto extends Animale {
	//non scrivo String nome perché lo ha ereditato da Animale

    public Gatto(String nome) {
        this.nome = nome;
    }

    @Override
    public void emettiVerso() {
        System.out.println("Miao!");
    }
}


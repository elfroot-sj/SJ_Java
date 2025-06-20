package _08_Overloading;

public class Main {
	public static void main(String[] args) {
		
		Calcolatrice calcolo = new Calcolatrice();
		System.out.println(calcolo.somma(4, 5));
		System.out.println(calcolo.somma(6, 2, 2));
		System.out.println(calcolo.somma(15.50, 10.20));
		calcolo.somma("tre", "due");
	}
	
}

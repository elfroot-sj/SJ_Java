package _08_Overloading;

public class Calcolatrice {
	
	
	public int somma(int a, int b) {
		return a + b;
	}
	
	public int somma(int a, int b, int c) {
		return a + b + c;
	}
	
	public double somma(double a, double b) {
		return a + b;
	}
	
	public void somma(String a, String b) {
		System.out.println(a + " + " + b);
	}
}

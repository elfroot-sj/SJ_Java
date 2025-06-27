package _12_Interfacce;

public class Main {
	public static void main(String[] args) {
		Auto_Ibrida a1 = new Auto_Ibrida(70); //la batteria è al 70%
		
		System.out.println(a1.toString());
		a1.ricarica(); //ricarico la batteria
		System.out.println(a1.toString());
		a1.connetti();
		
	}
}

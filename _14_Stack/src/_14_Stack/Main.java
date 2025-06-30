package _14_Stack;

public class Main {
	public static void main(String[] args) {
		Browser pagina = new Browser();
		
		pagina.visitPage("https://Wikipedia"); //sono URL simbolici
		pagina.visitPage("https://Google");
		pagina.visitPage("https://SitoBello");
		pagina.visitPage("https://SitoBrutto");
		
		pagina.printHistory();
		System.out.print("\n");
		
		//vado indietro due volte
		System.out.println("*torno indietro due volte*");
		pagina.goBack();
		pagina.goBack();
		System.out.print("\n");
		
		
		pagina.printHistory();
	}
}

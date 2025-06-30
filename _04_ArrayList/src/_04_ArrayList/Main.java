package _04_ArrayList;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productsList = new ArrayList<>();

        Product mozzarella = new Product("Mozzarella", "Santa Lucia", 3.2, LocalDate.of(2027, 8, 1));
        productsList.add(mozzarella);

        Product pomodoro = new Product("Pomodoro", "San Marzano", 2.0, LocalDate.of(2023, 2, 1));
        productsList.add(pomodoro);

        for (Product prodotto : productsList) {
            System.out.println(prodotto);
        }

        System.out.println("\n*****\n");
        
	      productsList.remove(0);
	      
        for (Product prodotto : productsList) {
            System.out.println(prodotto);
        }
        
        System.out.println("\n*****\n");
        
    	if (pomodoro.isExpired()) {
		    System.out.println("Prodotto scaduto");
		} else {
		    System.out.println("Prodotto non scaduto");
		}
        
    }
 }
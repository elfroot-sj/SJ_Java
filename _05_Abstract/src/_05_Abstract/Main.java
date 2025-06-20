package _05_Abstract;

public class Main {
    public static void main(String[] args) {
        Cerchio c = new Cerchio(5); //ho un cerchio di raggio 5 e voglio calcolare l'area
        double areaCerchio = c.calcolaArea();
        System.out.println("Area cerchio: " +areaCerchio);
        
        Rettangolo rettangolo = new Rettangolo(5, 10);
        double perimetroRettangolo = rettangolo.calcolaPerimetro();
        System.out.println("Perimetro rettangolo: " +perimetroRettangolo);
    }
}

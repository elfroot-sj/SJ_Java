package _01_Project1;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Eleonora", "Arcuri", 29, "pass123", "Sviluppatrice");

        System.out.println(emp); // usa toString()
        System.out.println("Password (mascherata): " + emp.getPassword());

        System.out.println("\nModifico la password in 'ciao':");
        emp.setPassword("ciao"); // troppo corta → non viene accettata

        System.out.println("Password attuale (mascherata): " + emp.getPassword());
    }
}


package _01_Project1;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String password;

    public Person(String name, String surname, int age, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        setPassword(password); // usa il setter per applicare validazione -------- è come scrivere: this.setPassword(password);
    }

    public String getName() {  //String è il tipo di ritorno
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        // Ritorna la password mascherata
        return "*".repeat(password.length());
    }

    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("La password deve contenere almeno 6 caratteri.");
        } else {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age + " anni";
    }
}


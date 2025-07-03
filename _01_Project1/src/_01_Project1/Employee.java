package _01_Project1;

public class Employee extends Person {
    private String jobTitle;

    public Employee(String name, String surname, int age, String password, String jobTitle) {
        super(name, surname, age, password); // chiama il costruttore di Person
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLavora come: " + jobTitle; //super.toString() chiama il metodo toString() della superclasse Person
    }
}



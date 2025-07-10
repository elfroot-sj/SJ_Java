package _19_GraphicInterface_Nursery;

public class Succulent extends Plant { //e.g. Aloe, Cactus, Echeveria
	private int droughtResistance; // resistenza alla siccità, es: da 1 a 10

    public Succulent(String name, String description, double price, int droughtResistance) {
        super(name, description, price);
        this.droughtResistance = droughtResistance;
    }

    public int getDroughtResistance() {
        return droughtResistance;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDrought Resistance: " + droughtResistance;
    }
}

package _19_GraphicInterface_Nursery;

public class Herb extends Plant { //e.g. Basil, Mint, Rosemary
    private String use;

    public Herb(String name, String description, double price, String use) {
        super(name, description, price);
        this.use = use;
    }

    public String getUse() {
        return use;
    }

    @Override
    public String toString() {
        return super.toString() + "\nUse: " + use;
    }
}


package _19_GraphicInterface_Nursery;

public class Flower extends Plant {//e.g. Rose, Tulip, Daisy
    private String color;

    public Flower(String name, String description, double price, String color) {
        super(name, description, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + color;
    }
}


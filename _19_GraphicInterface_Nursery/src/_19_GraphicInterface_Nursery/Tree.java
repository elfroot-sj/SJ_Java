package _19_GraphicInterface_Nursery;

public class Tree extends Plant { //e.g. Olive, Citrus, Maple
    private double maxHeight;

    public Tree(String name, String description, double price, double maxHeight) {
        super(name, description, price);
        this.maxHeight = maxHeight;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMax Height: " + maxHeight + " m";
    }
}


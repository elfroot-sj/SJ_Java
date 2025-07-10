package _19_GraphicInterface_Nursery;

public class Plant {
	private String name;
    private String description;
    private double price;

    public Plant(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public double getPrice() {
    	return price;
    }

    @Override
    public String toString() {
        return name + ": " + description + "\nPrice: " + price;
    }
	
	
}

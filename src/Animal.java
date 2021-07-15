public abstract class Animal {
    // this is a new concept: Static variables!
    // Think of a static variable as an attribute SHARED across all instances of this class
    // Here, I will create an animal counter integer variable.
    // Look at the constructor, every time I call it, it increases the animalCounter by 1;
    private static int animalCounter; // I also included a getAnimalCounter() method at the bottom of the class

    private String name;
    private String type;
    private String description;
    private double price;
    private boolean isInStock;


    public Animal() {
        animalCounter++;
    }

    public Animal(String name, String type, String description, double price, boolean isInStock) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public static int getAnimalCounter(){
        return animalCounter;
    }

    // abstract method
    abstract String getPet();


}

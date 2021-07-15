public class Cat extends Animal {
    private static int catCounter;

    public Cat(){
        super(); // super() == Animal(), which already includes the animalCounter++;
        catCounter++;
    }

    public static int getCatCounter(){
        return catCounter;
    }

    @Override
    public String getPet(){
        String petInfo = "";
        petInfo += "Name:\t" + this.getName() + "\n";
        petInfo += "Type:\t" + this.getType() + "\n";
        petInfo += "Description:\t" + this.getDescription() + "\n";
        return petInfo;
    }
}

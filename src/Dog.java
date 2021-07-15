public class Dog extends Animal {
    private static int dogCounter;




    public Dog(){
        super(); // super() == Animal(), which already includes the animalCounter++;
        dogCounter++;
    }


    @Override
    public String getPet(){
        String petInfo = "";
        petInfo += "Name:\t" + this.getName() + "\n";
        petInfo += "Type:\t" + this.getType() + "\n";
        petInfo += "Description:\t" + this.getDescription() + "\n";
        return petInfo;
    }

    public static int getDogCounter(){
        return dogCounter;
    }




}

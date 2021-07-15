/*
Create a project in IntelliJ called AnimalApplication.

Create a Animal class that allows for Animal name, type , description, price and isInStock variables

The ABSTRACT Animal class shall contain private member variables, a default constructor, an overloaded constructor and an abstract method called getPet() which returns a String with the animal name, type and description.





Create at least two classes that inherit from the Animal class.

The application shall also contain getters and setters for each private member variable.

Create another class called AnimalApp which contains the main method. In the main method you shall create at least 3 instances of classes that inherit the Animal abstract class. Use User input to set the private member variables.   Save user entry in a collection and print the Animal name, Animal Type and Description.

All I/O (input/output) should be done in the main method!!



Publish your solution to GitHub and submit your GitHub url as the assignment.


 */


import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again = "n";
        ArrayList<Animal> pets = new ArrayList<>();

        int typeChoice;
        do {
            System.out.print("Do you want a dog or a cat? ('1' for dog, '2' for cat): ");
            typeChoice = sc.nextInt();
            // scanner buffer
            sc.nextLine();
            System.out.print("Please enter your pet's name: ");
            String petName = sc.nextLine();
            System.out.print("Please enter your pet's type: ");
            String petType = sc.nextLine();
            System.out.print("Please enter your pet's description: ");
            String petDescription = sc.nextLine();
            if (typeChoice == 1){
                Dog dog = new Dog();
                dog.setName(petName);
                dog.setType(petType);
                dog.setDescription(petDescription);
                pets.add(dog);
            } else if (typeChoice == 2) {
                Cat cat = new Cat();
                cat.setName(petName);
                cat.setType(petType);
                cat.setDescription(petDescription);
                pets.add(cat);
            }

            System.out.println("Do you want to create a new pet? (y/n)");
            again = sc.nextLine();
        } while (again.equalsIgnoreCase("y"));

        // print out my Animals
        for (Animal pet: pets){
            System.out.println(pet.getPet());
            System.out.println("**************");
        }
        /*
        Dog d = new Dog();
        d.setName("Roxie");
        d.setType("Golden Retriever");
        d.setDescription(d.getName() + " is a " + d.getType());

        Cat c = new Cat();
        c.setName("Pepper");
        c.setType("Siamese cat");
        c.setDescription(c.getName() + " is a " + c.getType());

        Cat c2 = new Cat();
        c2.setName("Garfield");
        c2.setType("Persian tabby");
        c2.setDescription(c2.getName() + " is a " + c2.getType());



        System.out.println(d.getPet());
        System.out.println("*************");
        System.out.println(c.getPet());
        System.out.println("*************");
        System.out.println(c2.getPet());
        System.out.println("*************");


         */


        // Testing my static variables
        System.out.println("Total animals instantiated: " + Cat.getAnimalCounter());
        // You can also get that number directly from the abstract class

        // System.out.println("Total animals instantiated: " + Animal.getAnimalCounter());
        // May seem like a paradox, but notice that even if we do not instantiate an Animal class directly,
        // the animal constructor is used every time we call either Cat or Dog constructors.
        System.out.println("Total Cats instantiated: " + Cat.getCatCounter());
        System.out.println("Total Dogs instantiated: " + Dog.getDogCounter());
    }
}

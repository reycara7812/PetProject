package petproject;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberPets = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Pet[] pets = new Pet[numberPets];

        for (int i = 0; i < numberPets; i++) {
            System.out.println("What is the type of pet " + (i + 1) + "?");
            String typeOfPet = scanner.nextLine();

            System.out.println("What is your pet's name?");
            String petName = scanner.nextLine();

            switch (typeOfPet.toLowerCase()) {
                case "dog":
                    Dog dog = new Dog(petName, typeOfPet);
                    pets[i] = dog;
                    break;
                case "cat":
                    Cat cat = new Cat(petName, typeOfPet);
                    pets[i] = cat;
                    break;
                case "fish":
                    Fish fish = new Fish(petName, typeOfPet);
                    pets[i] = fish;
                    break;
                default:
                    System.out.println("Pet not supported");

            }
        }


        for (Pet pet : pets) {
            if (pet != null) {
                System.out.println("Name: " + pet.getName());
                System.out.println("Type: " + pet.getTypePet());
                pet.speak();
            }
        }
    }
}

package petproject;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have");
        int numberPets = scanner.nextInt();

        List<Pet> pets =new ArrayList<>();

       for (int i=0;i<numberPets;i++){
           Scanner scanner2 = new Scanner(System.in);
           System.out.println("What is your type of pet");
           String typeOfPet = scanner2.next();

           Scanner scanner3= new Scanner(System.in);
           System.out.println("Whats your pet name");
           String petName = scanner3.next();

           switch (typeOfPet.toLowerCase()){
               case "dog":
                   Dog dog = new Dog(petName,typeOfPet);
                   pets.add(dog);
                   break;
               case "cat":
                   Cat cat = new Cat(petName,typeOfPet);
                   pets.add(cat);
                   break;
               case "fish":
                   Fish fish = new Fish(petName,typeOfPet);
                   pets.add(fish);
                   break;
               default:
                   System.out.println("Pet not supported");
           }
       }
//for each pet it will go again
        for (Pet pet:pets
             ) {
            System.out.println(pet.getName());
            System.out.println(pet.getTypePet());
            pet.speak();

        }




    }
}

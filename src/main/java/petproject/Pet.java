package petproject;
import java.util.ArrayList;
import java.util.Scanner;

 public abstract class Pet {
     private String name;
     private String typePet;

     public Pet (String name,String typePet){
         this.name = name;
         this.typePet=typePet;}

     public String getName() {
         return name;
     }

     public void setName(String name) {
         name = name;
     }


     public String getTypePet() {
         return typePet;
     }
     public void setTypePet(String typePet) {
         this.typePet = typePet;
     }

     public abstract void speak();
}

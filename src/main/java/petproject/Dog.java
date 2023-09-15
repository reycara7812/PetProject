package petproject;

public class Dog extends Pet {
    public Dog(String name, String typePet) {
        super(name, typePet);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "says woof");

    }
}

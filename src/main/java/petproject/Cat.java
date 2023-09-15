package petproject;

public class Cat extends Pet{
    public Cat(String name, String typePet) {
        super(name, typePet);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "says meow meow");

    }
}

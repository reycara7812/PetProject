package petproject;

public class Fish extends Pet{
    public Fish(String name, String typePet) {
        super(name, typePet);
    }

    @Override
    public void speak() {
        System.out.println(getName()+"bluup bluup");

    }
}

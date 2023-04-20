package OOPjava.HW7.Pets;

public class Fish extends Pet {

    public Fish(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return String.format("Fishy %s", super.getInfo());
    }
}

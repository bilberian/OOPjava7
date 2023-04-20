package OOPjava.HW7.Pets;

public abstract class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getInfo() {
        return String.format("Name: %s", this.name);
    }

    public String getName() {
        return this.name;
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }
}

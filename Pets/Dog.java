package OOPjava.HW7.Pets;

public class Dog extends Pet implements Voice, WagTail {

    protected int weight;

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return String.format("Dog %s, weight: %d", super.getInfo(), this.weight);
    }

    public void doVoice() {
        if (this.weight >= 10) {
            System.out.println(this.getName() + " says Wuuuuuuuf");
        } else {
            System.out.println(this.getName() + " says wuf-wuf!");
        }
    }

    public void wagTail() {
        System.out.println(this.getName() + " wags its tail");
    }
}

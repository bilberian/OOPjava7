package OOPjava.HW7.Pets;

public class Puppy extends Dog {

    private int age;

    public Puppy(String name, int weight, int age) {
        super(name, weight);
        this.age = age;
    }

    @Override
    public String getInfo() {
        return String.format("Puppy %s, age: %d months", super.getInfo(), this.age);
    }

    @Override
    public void doVoice() {
        if (this.age > 6) {
            super.doVoice();
        } else {
            System.out.println("auwwww");
        }
    }

}

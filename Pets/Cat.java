package OOPjava.HW7.Pets;

public class Cat extends Pet implements Voice, Hiss{
    
    protected int weight;

    public Cat(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return String.format("Cat %s, weight %d", super.getInfo(), this.weight);
    }

    public void doVoice() {
        if (this.weight >= 5) {
            System.out.println(this.getName() + " says Meow");
        } else {
            System.out.println(this.getName() + " says Murrrr");
        }
    }

    public void hiss() {
        System.out.println(this.getName() + "'s fur goes upright and he hisses!");
    }
}

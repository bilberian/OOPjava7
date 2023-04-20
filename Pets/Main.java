package OOPjava.HW7.Pets;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fish nemo = new Fish("Nemo");
        Dog rex = new Dog("Rex", 11);
        Dog rada = new Dog("Rada", 8);
        Puppy pluto = new Puppy("Pluto", 2, 7);
        Puppy milka = new Puppy("Milka", 3, 3);
        Cat felix = new Cat("Felix", 6);

        List<Pet> petFam = new ArrayList<>();
        petFam.add(rex);
        petFam.add(rada);
        petFam.add(nemo);
        petFam.add(pluto);
        petFam.add(milka);
        petFam.add(felix);

        for (int i = 0; i < petFam.size(); i++) {
            System.out.println(petFam.get(i).getInfo());
        }

        rada.wagTail();
        System.out.println("======");
        rex.doVoice();
        System.out.println("======");
        milka.sleep();
        System.out.println("======");
        pluto.doVoice();
        System.out.println("======");
        felix.hiss();
        System.out.println("======");
        nemo.eat();
        System.out.println("======");
    }
}

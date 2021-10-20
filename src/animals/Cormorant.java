package animals;

import animal.types.Bird;
import diet.types.Carnivorous;
import places.AviaryPool;

public class Cormorant extends Bird implements AviaryPool, Carnivorous {
    @Override
    public void eatMeat() {
        System.out.println("meat is good");
    }

    @Override
    public void fly() {
        System.out.println("flap your wings");
    }

    @Override
    public void swim() {
        System.out.println("underwater ~~");
    }
}

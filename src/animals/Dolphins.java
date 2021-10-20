package animals;

import animal.types.Mammalian;
import diet.types.Carnivorous;
import places.Pool;

public class Dolphins extends Mammalian implements Carnivorous, Pool {

    @Override
    public void eatMeat() {
        System.out.println("meat is good");
    }

    @Override
    public void swim() {
        System.out.println("underwater ~~");
    }
}

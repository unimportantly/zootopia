package animals;

import animal.types.Bird;
import diet.types.Carnivorous;
import places.Aviary;

public class Eagle extends Bird implements Carnivorous, Aviary {

    @Override
    public void eatMeat() {
        System.out.println("meat is good");
    }

    @Override
    public void fly() {
        System.out.println("flap your wings!");
    }
}

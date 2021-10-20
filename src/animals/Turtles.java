package animals;

import animal.types.Reptilian;
import diet.types.Omnivorous;
import places.PoolTerrarium;

public class Turtles extends Reptilian implements PoolTerrarium, Omnivorous {
    @Override
    public void eatMeat() {
        System.out.println("meat is good");
    }

    @Override
    public void eatVegetation() {
        System.out.println("leaves are good");
    }

    @Override
    public void swim() {
        System.out.println("underwater~~ ");
    }

    @Override
    public void walk() {
        System.out.println("one foot in front of the other");
    }
}

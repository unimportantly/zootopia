package animals;

import animal.types.Mammalian;
import diet.types.Omnivorous;
import places.Terrarium;

public class Ape extends Mammalian implements Omnivorous, Terrarium {

    //attributes

    @Override
    public void eatMeat() {
        System.out.println("meat is good");
    }

    @Override
    public void eatVegetation() {
        System.out.println("leaves are good");
    }

    @Override
    public void walk() {
        System.out.println("one foot in front of another");
    }
}

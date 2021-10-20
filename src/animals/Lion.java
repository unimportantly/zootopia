package animals;

import animal.types.Mammalian;
import diet.types.Carnivorous;
import places.Terrarium;


public class Lion extends Mammalian implements Carnivorous, Terrarium {

    @Override
    public void eatMeat() {
        System.out.println("meat is good");
    }

    @Override
    public void walk() {
        System.out.println("one foot in front of another");
    }
}

package administration;

import diet.types.Carnivorous;
import diet.types.Herbivorous;
import diet.types.Omnivorous;

public class Feed {

    /**
     * give food to all the different animals in a zone
     * takes their diet into account
     */

    public void feed( animal){
        if (animal instanceof Omnivorous){
            System.out.println("Meat and vegetables were given to the " + animal);
        } else if (animal instanceof Carnivorous){
            System.out.println("Meat was given to the " + animal);
        } else if (animal instanceof Herbivorous){
            System.out.println("Vegetables were given to the " + animal);
        }
    }
}

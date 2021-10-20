package animal.types;

public abstract class Amphibian implements Vertebrates{

    //attributes
    final boolean isEctothermic = true;
    final boolean isTetrapod = true;
    final boolean hasAquaticLarva = true;
    final boolean[] amphibian = {isEctothermic, isTetrapod, hasAquaticLarva};

    //constructor

    public Amphibian() {
    }
}

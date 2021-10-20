package animal.types;

public abstract class Fish implements Vertebrates{

    //attributes
    final boolean isAquatic = true;
    final boolean hasGills = true;
    final boolean hasDigits = false;
    final boolean[] fish = {isAquatic, hasDigits, hasGills};

}

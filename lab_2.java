import Pokemons.*;
import ru.ifmo.se.pokemon.*;

class lab_2 {
    public static void main(String[] args) {
        Battle b = new Battle();

        Basculin p1 = new Basculin("Камиль", 1);
        Gulpin p2 = new Gulpin("Айнур", 2);
        Swalot p3 = new Swalot("Александр", 2);
        Spheal p4 = new Spheal("Pavel", 2);
        Sealeo p5 = new Sealeo("Amir", 2);
        Walrein p6 = new Walrein("Arslan", 3);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}

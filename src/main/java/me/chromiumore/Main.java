package me.chromiumore;

import me.chromiumore.animal.Snake;
import me.chromiumore.employee.EnclosureCleaner;
import me.chromiumore.employee.Keeper;
import me.chromiumore.employee.Vet;
import me.chromiumore.enclosure.Enclosure;

public class Main {
    public static void main(String[] args) {
        Keeper k = new Keeper("John", 27);
        Vet v = new Vet("Stephan", 30);
        EnclosureCleaner cl = new EnclosureCleaner("Lisa", 61);

        Snake snake = new Snake("Lola", 3, 4.2);

        Enclosure enclosure1 = new Enclosure(v, k, cl);
        enclosure1.addAnimal(snake);

        Zoo zoo = new Zoo();
        zoo.getEnclosures().add(enclosure1);
        zoo.start();
    }
}
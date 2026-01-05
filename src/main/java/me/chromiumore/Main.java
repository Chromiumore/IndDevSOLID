package me.chromiumore;

import me.chromiumore.animal.Lion;
import me.chromiumore.animal.Parrot;
import me.chromiumore.animal.Snake;
import me.chromiumore.employee.EnclosureCleaner;
import me.chromiumore.employee.Keeper;
import me.chromiumore.employee.Vet;
import me.chromiumore.enclosure.Enclosure;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Keeper k = new Keeper("John", 27);
        Vet v = new Vet("Stephan", 30);
        EnclosureCleaner cl = new EnclosureCleaner("Lisa", 61);

        Snake snake = new Snake("Lola", 3, 4.2);

        Enclosure enclosure1 = new Enclosure(v, k, cl);
        enclosure1.addAnimal(snake);

        Enclosure enclosure2 = new Enclosure(v, k, k);
        enclosure2.addAnimal(new Lion("Bob", 8, 70, LocalDateTime.of(2025, 1, 4, 0, 0, 0)));
        enclosure2.addAnimal(new Lion("Jora", 2, 43));
        enclosure2.addAnimal(new Parrot("Tolya", 1, 1.1));

        Zoo zoo = new Zoo();
        zoo.getEnclosures().add(enclosure1);
        zoo.getEnclosures().add(enclosure2);
        zoo.displayStats();
        zoo.start();
        zoo.displayStats();
    }
}
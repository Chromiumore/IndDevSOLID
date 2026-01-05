package me.chromiumore.employee;

import me.chromiumore.animal.Animal;
import me.chromiumore.enclosure.Enclosure;

import java.time.LocalDate;

public class Keeper extends Employee implements Feeder, Cleaner {
    public Keeper(String name, int age, LocalDate hiredOn) {
        super(name, age, hiredOn);
    }

    public Keeper(String name, int age) {
        super(name, age);
    }

    @Override
    public void feedAnimal(Animal animal) {
        System.out.println(toString() + " кормит " + animal.toString());
        animal.eat();
    }

    @Override
    public void clean(Enclosure enclosure) {
        System.out.println(toString() + " немного убирает вольер");
        enclosure.reducePurity(0.6);
    }

    @Override
    public String toString() {
        return "Смотритель " + getName();
    }
}

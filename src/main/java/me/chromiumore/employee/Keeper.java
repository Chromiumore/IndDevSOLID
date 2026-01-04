package me.chromiumore.employee;

import me.chromiumore.animal.Animal;

import java.time.LocalDate;

public class Keeper extends Employee implements Feeder {
    public Keeper(String name, int age, LocalDate hiredOn) {
        super(name, age, hiredOn);
    }

    public Keeper(String name, int age) {
        super(name, age);
    }

    @Override
    public void feedAnimal(Animal animal) {
        System.out.println(toString() + " кормит " + toString());
        animal.eat();
    }

    @Override
    public String toString() {
        return "Смотритель " + getName();
    }
}

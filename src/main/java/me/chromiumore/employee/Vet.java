package me.chromiumore.employee;

import me.chromiumore.animal.Animal;

import java.time.LocalDate;

public class Vet extends Employee implements Doctor {
    public Vet(String name, int age, LocalDate hiredOn) {
        super(name, age, hiredOn);
    }

    public Vet(String name, int age) {
        super(name, age);
    }

    @Override
    public void treatAnimal(Animal animal) {
        System.out.println(toString() + " лечит " + animal.toString());
        animal.heal();
    }

    @Override
    public String toString() {
        return "Доктор " + getName();
    }
}

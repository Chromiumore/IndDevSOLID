package me.chromiumore.employee;

import me.chromiumore.enclosure.Enclosure;

import java.time.LocalDate;

public class EnclosureCleaner extends Employee implements Cleaner {
    public EnclosureCleaner(String name, int age, LocalDate hiredOn) {
        super(name, age, hiredOn);
    }

    public EnclosureCleaner(String name, int age) {
        super(name, age);
    }

    @Override
    public void clean(Enclosure enclosure) {
        System.out.println(toString() + " убирает вольер");
        enclosure.reducePurity(1);
    }

    @Override
    public String toString() {
        return "Уборщик " + getName();
    }
}

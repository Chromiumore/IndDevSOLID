package me.chromiumore.animal;

import java.time.LocalDateTime;

public class Parrot extends Animal {
    public Parrot(String name, int age, double weight) {
        super("Попугай", name, age, weight);
    }

    public Parrot(String name, int age, double weight, LocalDateTime whenLastFed) {
        super("Попугай", name, age, weight, whenLastFed);
    }

    @Override
    protected void behaveNormally() {
        System.out.println(toString() + ": Попугай иммитирует звуки модема");
    }
}

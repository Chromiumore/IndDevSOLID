package me.chromiumore.animal;

import java.time.LocalDateTime;

public class Lion extends Animal {
    public Lion(String name, int age, double weight) {
        super("Лев", name, age, weight);
    }

    public Lion(String name, int age, double weight, LocalDateTime whenLastFed) {
        super("Лев", name, age, weight, whenLastFed);
    }

    @Override
    protected void behaveNormally() {
        System.out.println(toString() + ": Лев точит когти об дерево");
    }
}

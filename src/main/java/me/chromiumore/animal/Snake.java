package me.chromiumore.animal;

import java.time.LocalDateTime;

public class Snake extends Animal {
    public Snake(String name, int age, double weight) {
        super("Змея", name, age, weight);
    }

    public Snake(String name, int age, double weight, LocalDateTime whenLastFed) {
        super("Змея", name, age, weight, whenLastFed);
    }

    @Override
    protected void behaveNormally() {
        System.out.println(toString() + ": Змейка ползает среди камней");
    }
}

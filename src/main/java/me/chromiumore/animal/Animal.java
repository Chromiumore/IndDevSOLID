package me.chromiumore.animal;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Animal {
    private final String speciesName;

    protected String name;
    protected int age;
    protected double weight;
    protected boolean sickness;
    protected LocalDateTime whenLastFed;

    protected Animal(String speciesName, String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sickness = false;
        this.whenLastFed = LocalDateTime.now();
        this.speciesName = speciesName;
    }

    protected abstract void behaveNormally();

    protected boolean isHungry() {
        return Duration.between(LocalDateTime.now(), whenLastFed).toHours() >= 4;
    }

    protected boolean isSick() {
        sickness = Math.random() <= 0.2 || sickness;
        return sickness;
    }

    public boolean checkRequiresCare() {
        boolean result = false;
        if (isHungry()) {
            result = true;
            System.out.println(toString() + ": Животное проголодалось");
        }

        if (isSick()) {
            result = true;
            System.out.println(toString() + ": Животное заболело");
        }

        if (!result) {
            System.out.println(toString() + ": Животное нне нуждается в уходе");
            behaveNormally();
        }

        return result;
    }

    public void eat() {
        whenLastFed = LocalDateTime.now();
        System.out.println(toString() + ": Животное покушало");
    }

    public void heal() {
        sickness = false;
        System.out.println(toString() + ": Животное вылечино");
    }

    @Override
    public String toString() {
        return speciesName + " " + name;
    }
}

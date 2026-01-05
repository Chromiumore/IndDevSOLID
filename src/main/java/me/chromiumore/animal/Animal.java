package me.chromiumore.animal;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Animal {
    private static int nextId = 0;

    private final String speciesName;

    protected int id;
    protected String name;
    protected int age;
    protected double weight;
    protected boolean sickness;
    protected LocalDateTime whenLastFed;

    public Animal(String speciesName, String name, int age, double weight, LocalDateTime whenLastFed) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sickness = false;
        this.whenLastFed = whenLastFed;
        this.speciesName = speciesName;
    }

    public Animal(String speciesName, String name, int age, double weight) {
        this(speciesName, name, age, weight, LocalDateTime.now());
    }

    protected abstract void behaveNormally();

    protected boolean isHungry() {
        return Duration.between(whenLastFed, LocalDateTime.now()).toHours() >= 4;
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
            System.out.println(toString() + ": Животное не нуждается в уходе");
            behaveNormally();
        }

        return result;
    }

    public void eat() {
        if (isHungry()) {
            whenLastFed = LocalDateTime.now();
            System.out.println(toString() + ": Животное покушало");
        } else {
            System.out.println(toString() + ": Животное не хочет есть");
        }
    }

    public void heal() {
        if (isSick()) {
            sickness = false;
            System.out.println(toString() + ": Животное вылечено");
        } else {
            System.out.println(toString() + ": Животное не нуждается в лечении");
        }
    }

    @Override
    public String toString() {
        return speciesName + " " + name;
    }
}

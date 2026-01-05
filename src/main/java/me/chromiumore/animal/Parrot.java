package me.chromiumore.animal;

public class Parrot extends Animal {
    public Parrot(String name, int age, double weight) {
        super("Попугай", name, age, weight);
    }

    @Override
    protected void behaveNormally() {
        System.out.println(toString() + ": Попугай иммитирует звуки модема");
    }
}

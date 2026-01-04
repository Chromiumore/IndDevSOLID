package me.chromiumore.animal;

public class Snake extends Animal {
    public Snake(String name, int age, double weight) {
        super("Змея", name, age, weight);
    }

    @Override
    protected void behaveNormally() {
        System.out.println(toString() + ": Змейка ползает среди камней");
    }
}

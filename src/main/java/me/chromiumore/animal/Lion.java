package me.chromiumore.animal;

public class Lion extends Animal {
    public Lion(String name, int age, double weight) {
        super("Лев", name, age, weight);
    }

    @Override
    protected void behaveNormally() {
        System.out.println(toString() + ": Лев точит когти об дерево");
    }
}

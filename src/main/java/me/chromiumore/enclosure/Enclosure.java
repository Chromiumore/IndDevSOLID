package me.chromiumore.enclosure;

import me.chromiumore.animal.Animal;
import me.chromiumore.employee.Cleaner;
import me.chromiumore.employee.Doctor;
import me.chromiumore.employee.Feeder;

import java.util.ArrayList;

public class Enclosure {
    private static int nextId = 0;

    private int id;
    private ArrayList<Animal> animals;
    private Doctor doctor;
    private Feeder feeder;
    private Cleaner cleaner;
    private double purityLevel;

    public Enclosure(Doctor doctor, Feeder feeder, Cleaner cleaner) {
        this.id = nextId;
        nextId++;
        this.doctor = doctor;
        this.feeder = feeder;
        this.cleaner = cleaner;
        animals = new ArrayList<>();
        purityLevel = 0.25;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void increasePurity(double value) {
        purityLevel += Math.abs(value);
        purityLevel = Math.min(1, purityLevel);
    }

    public void reducePurity(double value) {
        purityLevel -= Math.abs(value);
        purityLevel = Math.max(purityLevel, 0);
    }

    public void startProcedures() {
        increasePurity(0.65);

        System.out.println("====== Начало процедур в вольере " + String.valueOf(id) + " ======");

        for (Animal a : animals) {
            if (a.checkRequiresCare()) {
                doctor.treatAnimal(a);
                feeder.feedAnimal(a);
            }
        }

        cleaner.clean(this);

        System.out.println("====== Окончание процедур ======\n");
    }
}

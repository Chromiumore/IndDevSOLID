package me.chromiumore;

import me.chromiumore.employee.Employee;
import me.chromiumore.enclosure.Enclosure;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Enclosure> enclosures;

    public Zoo() {
        enclosures = new ArrayList<>();
    }

    public void start() {
        for (Enclosure e : enclosures) {
            e.startProcedures();
        }
    }

    public void displayStats() {
        System.out.println("====== Статистика ======");

        int totalAnimals = 0;
        for (Enclosure e : enclosures) {
            totalAnimals += e.getAnimals().size();
            System.out.println("Чистота вольера номер " + e.getId() + ": " + e.getPurityLevel());
            System.out.println("Животных в вольере номер " + e.getId() + ": " + e.getAnimals().size());
        }

        System.out.println("Животных в вольерах: " + totalAnimals);

        System.out.println("========================\n");
    }

    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }

    public void setEnclosures(ArrayList<Enclosure> enclosures) {
        this.enclosures = enclosures;
    }
}

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

    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }

    public void setEnclosures(ArrayList<Enclosure> enclosures) {
        this.enclosures = enclosures;
    }
}

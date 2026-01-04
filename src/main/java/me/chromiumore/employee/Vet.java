package me.chromiumore.employee;

import java.time.LocalDate;

public class Vet extends Employee {
    public Vet(String name, int age, LocalDate hiredOn) {
        super(name, age, hiredOn);
    }

    public Vet(String name, int age) {
        super(name, age);
    }
}

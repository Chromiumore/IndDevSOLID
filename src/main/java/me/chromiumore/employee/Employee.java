package me.chromiumore.employee;

import java.time.LocalDate;
import java.util.Date;

public abstract class Employee {
    private String name;
    private int age;
    private LocalDate hiredOn;

    public Employee(String name, int age, LocalDate hiredOn) {
        this.name = name;
        this.age = age;
        this.hiredOn = hiredOn;
    }

    public Employee(String name, int age) {
        this(name, age, LocalDate.now());
    }
}

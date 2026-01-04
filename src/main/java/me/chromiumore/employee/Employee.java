package me.chromiumore.employee;

import java.time.LocalDate;
import java.util.Date;

public abstract class Employee {
    private String name;
    private int age;
    private final LocalDate hiredOn;

    public Employee(String name, int age, LocalDate hiredOn) {
        this.name = name;
        this.age = age;
        this.hiredOn = hiredOn;
    }

    public Employee(String name, int age) {
        this(name, age, LocalDate.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getHiredOn() {
        return hiredOn;
    }

    @Override
    public String toString() {
        return "Сотрудник " + name;
    }
}

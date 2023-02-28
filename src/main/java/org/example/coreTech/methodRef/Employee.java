package org.example.coreTech.methodRef;

import lombok.Data;

@Data
public class Employee {
    int id;
    String name;
    String gender;
    double salary;

    public Employee(int id, String name, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
}

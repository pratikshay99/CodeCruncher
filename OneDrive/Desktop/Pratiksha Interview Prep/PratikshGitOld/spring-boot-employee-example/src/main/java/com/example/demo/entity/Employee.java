package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;
    private Double salary;
    /**
     @Column(name = "emp_name", nullable = false, length = 100)
     private String name;
     @Column(unique = true)
     private String email;
     */
    public Employee() {
    }

    public Employee(String name, String department, Double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    // maybe also: password, ssn, internal audit fields, etc.

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
/**
 @Column(name = "emp_name", nullable = false, length = 100)
 private String name;

 @Column(unique = true)
 private String email;
 @Column is only required when you want to customize the mapping — e.g., a different column name, nullable = false, unique = true, length, etc.
 If you don't specify it, JPA/Hibernate auto-maps the field name to a column of the same name by default.

 if asked "why didn't you use @Column?", answer confidently: "By default JPA maps field names to column names implicitly — I only add @Column when I need custom naming or constraints like nullable/unique.

 */
package com.example.demo.dto;

public class EmployeeDTO {

    private Long id;
    private String name;
    private String department;
    private Double salary;

    // only what the client should see

    public EmployeeDTO() {
    }
    public EmployeeDTO(Long id, String name, String department, Double salary) {
        this.id = id;
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
 Interview line:
 "The Entity maps to the database table and is used only between the Repository and the database. The DTO is what's exposed through the API to the client. I keep them separate — even though the fields look similar here — so I can hide internal/sensitive fields, avoid tightly coupling my API to my database schema, and prevent serialization issues with lazy-loaded relationships. The Service layer is responsible for converting between the two."

 The core difference
            Entity	                                                                    DTO
 --------------------------------------------------------------------------------------------------------------------------------------------------------
 What it is	Maps to a database table	                                                Maps to what the API sends/receives (JSON)
 Used by	Repository ↔ Database	                                                    Controller ↔ Client
 Contains	Fields matching DB columns, JPA annotations (@Entity, @Id, @Column)	        Only the fields the client actually needs to see/send
 Purpose	Persistence (saving/loading data)	                                        Data transfer (communication with outside world)
 Full name	Entity	                                                                    DTO = "Data Transfer Object"
 Example	Employee.java	                                                            EmployeeDTO.java
            maybe also: password, ssn, internal audit fields, etc.                      only what the client should ses


 Why separate them if they look the same?
 #1 interview question here — "why not just return the Entity directly?" Three real reasons:

 Security / hiding internal fields — imagine Employee entity also had a password or an internal createdBy audit field. If you return the Entity directly as JSON, you accidentally expose those to the client. DTO lets you control exactly which fields leave the system.
 Decoupling API from database — if you change the database column name or add a new internal field to Employee, your API response (EmployeeDTO) doesn't have to change. This keeps your API contract stable even when your DB schema evolves.
 Avoiding lazy-loading / serialization issues — JPA entities often have relationships (@OneToMany, @ManyToOne) that are lazy-loaded. Serializing an Entity directly into JSON can cause errors (LazyInitializationException) or accidentally trigger huge nested object graphs. DTOs are flat and safe to serialize.

 Do you need both? Yes — same logic as Entity vs Repository
 Without the Entity → JPA has nothing to map to the database table; persistence breaks entirely.
 Without the DTO → You'd have to expose the Entity directly to the client, which risks leaking internal fields, tightly couples your API to your database schema, and can cause serialization bugs.
 */
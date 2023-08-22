package com.stg.brianb.stgbootrestcert.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private Long id;

    // create constructor and getter/setter methods for all fields in the class
    public Employee(Long id) {
        this.id = id;
    }
    public Employee() {

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }



}

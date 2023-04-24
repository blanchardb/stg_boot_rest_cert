package com.stg.brianb.stgbootrestcert.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Organization {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

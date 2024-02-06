package com.spring.mvc.studies.web.annotations.entities;

import jakarta.persistence.*;

@Entity
public class Bazz {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    public Bazz(Long id) {
        this.id = id;
    }

    public Bazz(Long id, String name) {
        this.id = id;
        this.name = name;
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
}

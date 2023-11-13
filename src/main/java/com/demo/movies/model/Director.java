package com.demo.movies.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Director {

    @Id
    @Column(name = "directorId", unique = true, nullable = false)
    private String directorId;

    private String name;

    private String surname;
}

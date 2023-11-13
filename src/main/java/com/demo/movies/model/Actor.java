package com.demo.movies.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Actor {

    @Id
    @Column(name = "actorId", unique = true, nullable = false)
    private String actorId;

    private String name;

    private String surname;
}

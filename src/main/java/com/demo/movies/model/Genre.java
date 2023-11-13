package com.demo.movies.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Genre {

    @Id
    @Column(name = "genreId", unique = true, nullable = false)
    private String genreId;

    private String name;

}

package com.demo.movies.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Movie {

    @Id
    @Column(name = "movieId", unique = true, nullable = false)
    private String movieId;

    private String title;

    private Integer year;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "movie")
    private Set<MovieGenreJoined> movieGenresJoined = new HashSet<>(0);

    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "movie")
    private Set<MovieActorJoined> movieActorsJoined = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "movie")
    private Set<MovieDirectorJoined> movieDirectorsJoined = new HashSet<>(0);

    private Integer runtime;

    private Double rating;

    private Integer votes;

    private Integer revenue;

    private Integer metaScore;

}

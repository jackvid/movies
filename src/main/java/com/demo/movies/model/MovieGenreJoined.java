package com.demo.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MovieGenreJoined {

    @Id
    @Column(name = "movieGenreJoined", unique = true, nullable = false)
    private String movieGenreJoinedId;

    @ManyToOne
    @JoinColumn(name = "FK_Movie")
    @JsonIgnore
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "FK_Genre")
    private Genre genre;
}

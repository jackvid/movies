package com.demo.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MovieActorJoined {

    @Id
    @Column(name = "movieActorJoinedId", unique = true, nullable = false)
    private String movieActorJoinedId;

    @ManyToOne
    @JoinColumn(name = "FK_Movie")
    @JsonIgnore
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "FK_Actor")
    private Actor actor;
}

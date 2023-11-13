package com.demo.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MovieDirectorJoined {

    @Id
    @Column(name = "movieDirectorJoinedId", unique = true, nullable = false)
    private String movieDirectorJoinedId;

    @ManyToOne
    @JoinColumn(name = "FK_Movie")
    @JsonIgnore
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "FK_Director")
    private Director director;
}

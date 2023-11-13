package com.demo.movies.dto;

import com.demo.movies.model.Genre;
import com.demo.movies.model.Movie;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MovieDto extends MovieSimpleDto {

    private Genre genre;

    private String description;

    private List<ActorDto> actors = new ArrayList<>();

    private List<DirectorDto> directors = new ArrayList<>();

    private Integer runtime;

    private Double rating;

    private Integer votes;

    private Integer metaScore;

    public MovieDto(Movie movie) {
        super(movie);
        setDescription(movie.getDescription());
        setRuntime(movie.getRuntime());
        setRating(movie.getRating());
        setVotes(movie.getVotes());
        setMetaScore(movie.getMetaScore());
        setGenre(movie.getGenre());

        movie.getMovieActorsJoined().forEach(movieActorJoined -> actors.add(new ActorDto(movieActorJoined.getActor())));
        movie.getMovieDirectorsJoined().forEach(movieDirectorJoined -> directors.add(new DirectorDto(movieDirectorJoined.getDirector())));
    }

}

package com.demo.movies.dto;

import com.demo.movies.model.Genre;
import com.demo.movies.model.Movie;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class MovieDto extends MovieSimpleDto {

    private Genre genre;

    private String description;

    private ArrayList<ActorDto> actors = new ArrayList();

    private ArrayList<DirectorDto> directors = new ArrayList<>();

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

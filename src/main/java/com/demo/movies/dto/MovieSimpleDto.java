package com.demo.movies.dto;

import com.demo.movies.model.Movie;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieSimpleDto {

    private String movieId;

    private Integer year;

    private String title;

    private Integer revenue;

    public MovieSimpleDto(Movie movie) {
        this.setMovieId(movie.getMovieId());
        this.setTitle(movie.getTitle());
        this.setYear(movie.getYear());
        this.setRevenue(movie.getRevenue());
    }

}

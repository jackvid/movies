package com.demo.movies.service.movie;

import com.demo.movies.dto.MovieDto;
import com.demo.movies.dto.MovieParamsDto;
import com.demo.movies.dto.MovieSimpleDto;

import java.util.List;

public interface MovieService {

    MovieDto getMovie(String movieId);

    List<MovieSimpleDto> getMovies(MovieParamsDto movieParams);

}

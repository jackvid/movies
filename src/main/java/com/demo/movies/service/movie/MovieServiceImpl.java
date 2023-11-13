package com.demo.movies.service.movie;

import com.demo.movies.dto.MovieDto;
import com.demo.movies.dto.MovieParamsDto;
import com.demo.movies.dto.MovieSimpleDto;
import com.demo.movies.repository.MovieRepository;
import com.demo.movies.repository.specification.MovieSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    private static final int ROWS_PER_PAGE = 10;

    @Override
    public MovieDto getMovie(String movieId) {
        return new MovieDto(movieRepository.getReferenceById(movieId));
    }

    @Override
    public List<MovieSimpleDto> getMovies(MovieParamsDto movieParams) {
        ArrayList<MovieSimpleDto> result = new ArrayList<>();
        MovieSpecification movieSpecification = new MovieSpecification(movieParams);
        movieRepository.findAll(movieSpecification, PageRequest.of(movieParams.getPage(), ROWS_PER_PAGE))
                .stream()
                .toList()
                .forEach(movie -> result.add(new MovieSimpleDto(movie)));
        return result;
    }
}

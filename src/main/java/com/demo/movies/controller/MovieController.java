package com.demo.movies.controller;

import com.demo.movies.dto.MovieDto;
import com.demo.movies.dto.MovieParamsDto;
import com.demo.movies.dto.MovieSimpleDto;
import com.demo.movies.service.movie.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;

    @GetMapping
    private ResponseEntity<List<MovieSimpleDto>> getMovies(MovieParamsDto params) {
        return ResponseEntity.ok(movieService.getMovies(params));
    }

    @GetMapping("/{movieId}")
    private ResponseEntity<MovieDto> getMovies(@PathVariable String movieId) {
        return ResponseEntity.ok(movieService.getMovie(movieId));
    }

}

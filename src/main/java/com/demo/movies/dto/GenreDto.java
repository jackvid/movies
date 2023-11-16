package com.demo.movies.dto;

import com.demo.movies.model.Genre;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GenreDto {

    private String genreId;

    private String name;

    public GenreDto(Genre genre) {
        setGenreId(genre.getGenreId());
        setName(genre.getName());
    }
}

package com.demo.movies.dto;

import com.demo.movies.model.Genre;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GenreDto {

    private String genreId;

    private String name;

    public GenreDto(Genre genre) {
        this.setGenreId(genre.getGenreId());
        this.setName(genre.getName());
    }
}

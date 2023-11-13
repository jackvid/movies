package com.demo.movies.dto;

import com.demo.movies.model.Director;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DirectorDto {

    private String directorId;

    private String name;

    private String surname;

    public DirectorDto(Director director) {
        setDirectorId(director.getDirectorId());
        setName(director.getName());
        setSurname(director.getSurname());
    }
}

package com.demo.movies.dto;

import com.demo.movies.model.Actor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ActorDto {

    private String actorId;

    private String name;

    private String surname;

    private String fullName;

    public ActorDto(Actor actor) {
        setActorId(actor.getActorId());
        setName(actor.getName());
        setSurname(actor.getSurname());
        setFullName(actor.getName() + " " + actor.getSurname());
    }

}

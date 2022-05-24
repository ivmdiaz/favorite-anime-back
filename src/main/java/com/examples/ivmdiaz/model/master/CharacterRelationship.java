package com.examples.ivmdiaz.model.master;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "character_relationship", schema = "master")
public class CharacterRelationship {

    @EmbeddedId
    private CharacterRelationshipId id;

}

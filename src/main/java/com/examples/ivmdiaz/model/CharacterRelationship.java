package com.examples.ivmdiaz.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character_relationship")
public class CharacterRelationship {

    @Id
    @SequenceGenerator(name = "character_relationship_generator", sequenceName = "character_relationship_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_relationship_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "anime_id")
    private Integer animeId;
    @Column(name = "character_id")
    private Integer characterId;
    @Column(name = "relationship_id")
    private Integer relationshipId;
    @Column(name = "relationship_character_id")
    private Integer relationshipCharacterId;
}

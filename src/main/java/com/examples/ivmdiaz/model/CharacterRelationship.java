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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private Character character;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "relationship_id", referencedColumnName = "id")
    private Relationship relationship;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "relationship_character_id", referencedColumnName = "id")
    private Character relationshipCharacter;
}

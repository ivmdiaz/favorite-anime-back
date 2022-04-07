package com.examples.ivmdiaz.model.master;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character_relationship", schema = "master")
public class CharacterRelationship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "relationship_id")
    private Relationship relationship;
    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character character;
    @ManyToOne
    @JoinColumn(name = "relationship_character_id")
    private Character relationshipCharacter;
}

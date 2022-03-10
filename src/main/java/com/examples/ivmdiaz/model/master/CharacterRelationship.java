package com.examples.ivmdiaz.model.master;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character_relationship", schema = "master")
public class CharacterRelationship {

    @Id
    @SequenceGenerator(name = "character_relationship_generator", sequenceName = "character_relationship_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_relationship_generator")
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

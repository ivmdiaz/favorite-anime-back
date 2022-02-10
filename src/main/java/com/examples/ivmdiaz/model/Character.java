package com.examples.ivmdiaz.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "character")
public class Character {

    @Id
    @SequenceGenerator(name = "character_generator", sequenceName = "character_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "anime_id")
    private Integer animeId;
    @Column(name = "name")
    private String name;
    @Column(name = "alias")
    private String alias;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "image_url")
    private String imageUrl;

    @OneToOne(mappedBy = "character")
    private CharacterSummary characterSummary;
    @OneToOne(mappedBy = "character")
    private CharacterRelationship characterRelationship;
    @OneToOne(mappedBy = "relationshipCharacter")
    private CharacterRelationship characterRelated;
}

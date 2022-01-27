package com.examples.ivmdiaz.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character_tag")
public class CharacterTag {

    @Id
    @SequenceGenerator(name = "character_tag_generator", sequenceName = "character_tag_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_tag_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "anime_id")
    private Integer animeId;
    @Column(name = "character_id")
    private Integer characterId;
    @Column(name = "tag_id")
    private Integer tagId;
}

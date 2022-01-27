package com.examples.ivmdiaz.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character_summary")
public class CharacterSummary {

    @Id
    @SequenceGenerator(name = "character_summary_generator", sequenceName = "character_summary_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_summary_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "anime_id")
    private Integer animeId;
    @Column(name = "character_id")
    private Integer characterId;
    @Column(name = "location_id")
    private Integer locationId;
    @Column(name = "introduction")
    private String introduction;
    @Column(name = "history")
    private String history;
    @Column(name = "abilities")
    private String abilities;
    @Column(name = "image_url")
    private String imageUrl;
}

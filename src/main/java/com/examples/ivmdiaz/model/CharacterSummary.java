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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private Character character;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;
    @Column(name = "introduction")
    private String introduction;
    @Column(name = "history")
    private String history;
    @Column(name = "abilities")
    private String abilities;
    @Column(name = "image_url")
    private String imageUrl;
}

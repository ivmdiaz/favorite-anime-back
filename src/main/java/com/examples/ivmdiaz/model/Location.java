package com.examples.ivmdiaz.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "location")
public class Location {

    @Id
    @SequenceGenerator(name = "location_generator", sequenceName = "location_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "location_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "anime_id")
    private Integer animeId;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "summary")
    private String summary;

    @OneToOne(mappedBy = "location")
    private CharacterSummary characterSummary;
}

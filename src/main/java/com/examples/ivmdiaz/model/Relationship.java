package com.examples.ivmdiaz.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "relationship")
public class Relationship {

    @Id
    @SequenceGenerator(name = "relationship_generator", sequenceName = "relationship_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "relationship_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "anime_id")
    private Integer animeId;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
}

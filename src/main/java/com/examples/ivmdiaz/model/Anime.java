package com.examples.ivmdiaz.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "anime")
public class Anime {

    @Id
    @SequenceGenerator(name = "anime_generator", sequenceName = "anime_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anime_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "created")
    private LocalDate created;
}

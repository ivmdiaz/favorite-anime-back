package com.examples.ivmdiaz.model.master;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "character", schema = "master")
public class Character {

    @Id
    @SequenceGenerator(name = "character_generator", sequenceName = "character_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "series_id")
    private Integer seriesId;
    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;
    @Column(name = "name")
    private String name;
    @Column(name = "alias")
    private String alias;
    @Column(name = "birthday")
    private LocalDate birthday;
}

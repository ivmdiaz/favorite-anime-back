package com.examples.ivmdiaz.model.master;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "character", schema = "master")
public class Character implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

package com.examples.ivmdiaz.model.master;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "series", schema = "master")
public class Series {

    @Id
    @SequenceGenerator(name = "series_generator", sequenceName = "series_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "series_generator")
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategorySeries category;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "created")
    private LocalDate created;
}

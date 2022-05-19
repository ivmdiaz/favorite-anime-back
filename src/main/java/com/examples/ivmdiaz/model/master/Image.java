package com.examples.ivmdiaz.model.master;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "image", schema = "master")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "series_id")
    private Integer seriesId;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryImage category;
    @Column(name = "code")
    private String code;
    @Column(name = "filename")
    private String filename;
    @Column(name = "url")
    private String url;
    @Column(name = "summary")
    private String summary;
}

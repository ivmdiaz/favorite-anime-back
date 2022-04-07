package com.examples.ivmdiaz.model.master;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "image", schema = "master")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "series_id")
    private Integer seriesId;
    @Column(name = "url")
    private String url;
    @Column(name = "name")
    private String name;
    @Column(name = "summary")
    private String summary;
    @Column(name = "tag")
    private String tag;
}

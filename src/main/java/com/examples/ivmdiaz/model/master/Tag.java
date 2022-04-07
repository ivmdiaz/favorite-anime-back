package com.examples.ivmdiaz.model.master;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tag", schema = "master")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "series_id")
    private Integer seriesId;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "summary")
    private String summary;
}

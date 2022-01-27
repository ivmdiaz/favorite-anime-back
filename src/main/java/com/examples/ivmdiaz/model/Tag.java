package com.examples.ivmdiaz.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @SequenceGenerator(name = "tag_generator", sequenceName = "tag_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tag_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "anime_id")
    private Integer animeId;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "icon_url")
    private String iconUrl;
    @Column(name = "summary")
    private String summary;
}

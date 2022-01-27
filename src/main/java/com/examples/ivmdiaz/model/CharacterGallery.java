package com.examples.ivmdiaz.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character_gallery")
public class CharacterGallery {

    @Id
    @SequenceGenerator(name = "character_gallery_generator", sequenceName = "character_gallery_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_gallery_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "anime_id")
    private Integer animeId;
    @Column(name = "character_id")
    private Integer characterId;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "image_name")
    private String imageName;
    @Column(name = "image_summary")
    private String imageSummary;
    @Column(name = "image_tag")
    private String imageTag;
}

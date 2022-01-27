package com.examples.ivmdiaz.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "location_gallery")
public class LocationGallery {

    @Id
    @SequenceGenerator(name = "location_gallery_generator", sequenceName = "location_gallery_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "location_gallery_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "anime_id")
    private Integer animeId;
    @Column(name = "location_id")
    private Integer locationId;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "image_name")
    private String imageName;
    @Column(name = "image_summary")
    private String imageSummary;
    @Column(name = "image_tag")
    private String imageTag;
}

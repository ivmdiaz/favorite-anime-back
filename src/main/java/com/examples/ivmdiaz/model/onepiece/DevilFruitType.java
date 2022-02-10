package com.examples.ivmdiaz.model.onepiece;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "onepiece_devil_fruit_type")
public class DevilFruitType {

    @Id
    @SequenceGenerator(name = "onepiece_devil_fruit_type_generator", sequenceName = "onepiece_devil_fruit_type_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "onepiece_devil_fruit_type_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "image_name")
    private String imageName;
    @Column(name = "image_summary")
    private String imageSummary;
    @Column(name = "summary")
    private String summary;

    @OneToOne(mappedBy = "type")
    private DevilFruit devilFruit;
}

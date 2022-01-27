package com.examples.ivmdiaz.model.onepiece;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "onepiece_devil_fruit")
public class DevilFruit {

    @Id
    @SequenceGenerator(name = "onepiece_devil_fruit_generator", sequenceName = "onepiece_devil_fruit_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "onepiece_devil_fruit_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "type_id")
    private Integer typeId;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "meaning")
    private String meaning;
    @Column(name = "icon_url")
    private String iconUrl;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "image_name")
    private String imageName;
    @Column(name = "image_summary")
    private String imageSummary;
    @Column(name = "introduction")
    private String introduction;
    @Column(name = "history")
    private String history;
}

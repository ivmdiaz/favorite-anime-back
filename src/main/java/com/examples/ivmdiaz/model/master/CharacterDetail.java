package com.examples.ivmdiaz.model.master;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "character_detail", schema = "master")
public class CharacterDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character character;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    @Column(name = "code")
    private String code;
    @Column(name = "introduction")
    private String introduction;
    @Column(name = "history")
    private String history;
    @Column(name = "abilities")
    private String abilities;

    @ManyToMany
    @JoinTable(
            name = "character_gallery", schema = "master",
            joinColumns = @JoinColumn(name = "character_detail_id"),
            inverseJoinColumns = @JoinColumn(name = "image_id")
    )
    private List<Image> gallery;

    @ManyToMany
    @JoinTable(
            name = "character_tag", schema = "master",
            joinColumns = @JoinColumn(name = "character_detail_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;
}

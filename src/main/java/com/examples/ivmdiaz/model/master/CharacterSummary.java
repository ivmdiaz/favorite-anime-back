package com.examples.ivmdiaz.model.master;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "character_summary", schema = "master")
public class CharacterSummary {

    @Id
    @SequenceGenerator(name = "character_summary_generator", sequenceName = "character_summary_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_summary_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "series_id")
    private Integer seriesId;
    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character character;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    @Column(name = "introduction")
    private String introduction;
    @Column(name = "history")
    private String history;
    @Column(name = "abilities")
    private String abilities;

    @ManyToMany
    @JoinTable(
            name = "character_gallery", schema = "master",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "image_id")
    )
    private List<Image> gallery;

    @ManyToMany
    @JoinTable(
            name = "character_tag", schema = "master",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;
}

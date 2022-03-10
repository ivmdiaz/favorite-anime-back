package com.examples.ivmdiaz.model.anime;

import com.examples.ivmdiaz.model.master.Image;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "devil_fruit", schema = "anime")
public class DevilFruit {

    @Id
    @SequenceGenerator(name = "devil_fruit_generator", sequenceName = "devil_fruit_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "devil_fruit_generator")
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private DevilFruitType type;
    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;
    @Column(name = "name")
    private String name;
    @Column(name = "meaning")
    private String meaning;
    @Column(name = "introduction")
    private String introduction;
    @Column(name = "history")
    private String history;
}

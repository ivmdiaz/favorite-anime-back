package com.examples.ivmdiaz.model.anime;

import com.examples.ivmdiaz.model.master.Image;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "devil_fruit_type", schema = "anime")
public class DevilFruitType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "summary")
    private String summary;
}

package com.examples.ivmdiaz.model.anime;

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
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "summary")
    private String summary;
}

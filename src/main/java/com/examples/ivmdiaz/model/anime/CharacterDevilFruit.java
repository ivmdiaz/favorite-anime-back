package com.examples.ivmdiaz.model.anime;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character_devil_fruit", schema = "anime")
public class CharacterDevilFruit {

    @Id
    @SequenceGenerator(name = "character_devil_fruit_generator", sequenceName = "character_devil_fruit_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_devil_fruit_generator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "character_id")
    private Integer characterId;
    @ManyToOne
    @JoinColumn(name = "devil_fruit_id")
    private DevilFruit devilFruit;
}

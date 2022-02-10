package com.examples.ivmdiaz.model.onepiece;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "onepiece_devil_fruit_character")
public class CharacterDevilFruit {

    @Id
    @SequenceGenerator(name = "onepiece_devil_fruit_character_generator", sequenceName = "onepiece_devil_fruit_character_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "onepiece_devil_fruit_character_generator")
    @Column(name = "id")
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "devil_fruit_id", referencedColumnName = "id")
    private DevilFruit devilFruit;
    @Column(name = "character_id")
    private Integer characterId;
}

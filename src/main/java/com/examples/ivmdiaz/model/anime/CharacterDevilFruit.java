package com.examples.ivmdiaz.model.anime;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "character_devil_fruit", schema = "anime")
public class CharacterDevilFruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "character_detail_id")
    private Integer characterDetailId;
    @ManyToOne
    @JoinColumn(name = "devil_fruit_id")
    private DevilFruit devilFruit;
}

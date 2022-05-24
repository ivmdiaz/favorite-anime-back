package com.examples.ivmdiaz.model.master;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class CharacterRelationshipId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "relationship_id")
    private Relationship relationship;
    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character character;
    @Column(name = "character_detail_id")
    private Integer characterDetailId;
}

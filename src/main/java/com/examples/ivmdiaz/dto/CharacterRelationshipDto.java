package com.examples.ivmdiaz.dto;

import com.examples.ivmdiaz.model.CharacterRelationship;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class CharacterRelationshipDto {

    private CharacterDto character;
    private RelationshipDto relationship;
    private CharacterDto relationshipCharacter;

    public CharacterRelationshipDto(CharacterRelationship cr) {
        final ModelMapper mapper = new ModelMapper();
        this.character = mapper.map(cr.getCharacter(), CharacterDto.class);
        this.relationship = mapper.map(cr.getRelationship(), RelationshipDto.class);
        this.relationshipCharacter = mapper.map(cr.getRelationshipCharacter(), CharacterDto.class);
    }
}

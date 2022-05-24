package com.examples.ivmdiaz.dto.master;

import com.examples.ivmdiaz.model.master.CharacterRelationship;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class CharacterRelationshipDto {

    private CharacterDto character;
    private KeyValueDto relationship;

    public CharacterRelationshipDto(CharacterRelationship characterRelationship) {
        final ModelMapper mapper = new ModelMapper();
        this.character = mapper.map(characterRelationship.getId().getCharacter(), CharacterDto.class);
        this.relationship = mapper.map(characterRelationship.getId().getRelationship(), KeyValueDto.class);
    }
}

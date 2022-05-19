package com.examples.ivmdiaz.dto.master;

import com.examples.ivmdiaz.model.master.CharacterRelationship;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class CharacterRelationshipDto {

    private CharacterDto character;
    private KeyValueDto relationship;

    public CharacterRelationshipDto(CharacterRelationship cr) {
        final ModelMapper mapper = new ModelMapper();
        this.character = mapper.map(cr.getCharacter(), CharacterDto.class);
        this.relationship = mapper.map(cr.getRelationship(), KeyValueDto.class);
    }
}

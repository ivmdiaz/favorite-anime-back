package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.CharacterTag;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterTagRepository extends ReadOnlyRepository<CharacterTag, Integer> {

    List<CharacterTag> findCharacterTagsByCharacterId(Integer characterId);
}

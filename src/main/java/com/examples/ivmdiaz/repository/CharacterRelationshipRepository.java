package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.CharacterRelationship;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRelationshipRepository extends ReadOnlyRepository<CharacterRelationship, Integer> {

    @Query("select cr from CharacterRelationship cr join cr.character c where c.id = :characterId ")
    List<CharacterRelationship> findCharacterRelationshipsByCharacterId(@Param("characterId") Integer characterId);
}

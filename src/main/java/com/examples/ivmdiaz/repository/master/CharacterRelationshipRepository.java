package com.examples.ivmdiaz.repository.master;

import com.examples.ivmdiaz.model.master.CharacterRelationship;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRelationshipRepository extends ReadOnlyRepository<CharacterRelationship, Integer> {

    List<CharacterRelationship> findByCharacterId(Integer characterId);
}

package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.CharacterRelationship;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRelationshipRepository extends ReadOnlyRepository<CharacterRelationship, Integer> {
}

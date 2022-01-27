package com.examples.ivmdiaz.repository;

import org.springframework.stereotype.Repository;
import com.examples.ivmdiaz.model.Character;

@Repository
public interface CharacterRepository extends ReadOnlyRepository<Character, Integer> {
}

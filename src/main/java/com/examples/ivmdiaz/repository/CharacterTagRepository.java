package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.CharacterTag;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterTagRepository extends ReadOnlyRepository<CharacterTag, Integer> {
}

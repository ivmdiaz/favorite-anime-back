package com.examples.ivmdiaz.repository.master;

import com.examples.ivmdiaz.model.master.CharacterDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDetailRepository extends ReadOnlyRepository<CharacterDetail, Integer> {

    CharacterDetail findFirstByCharacterId(Integer characterId);
}

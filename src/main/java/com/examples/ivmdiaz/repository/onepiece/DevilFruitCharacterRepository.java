package com.examples.ivmdiaz.repository.onepiece;

import com.examples.ivmdiaz.model.onepiece.CharacterDevilFruit;
import com.examples.ivmdiaz.repository.ReadOnlyRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevilFruitCharacterRepository extends ReadOnlyRepository<CharacterDevilFruit, Integer> {

    CharacterDevilFruit findByCharacterId(Integer characterId);

}

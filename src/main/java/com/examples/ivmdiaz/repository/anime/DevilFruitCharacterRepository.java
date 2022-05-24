package com.examples.ivmdiaz.repository.anime;

import com.examples.ivmdiaz.model.anime.CharacterDevilFruit;
import com.examples.ivmdiaz.repository.master.ReadOnlyRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevilFruitCharacterRepository extends ReadOnlyRepository<CharacterDevilFruit, Integer> {

    CharacterDevilFruit findByCharacterDetailId(Integer characterId);

}

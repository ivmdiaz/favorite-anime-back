package com.examples.ivmdiaz.repository.onepiece;

import com.examples.ivmdiaz.model.onepiece.DevilFruitCharacter;
import com.examples.ivmdiaz.repository.ReadOnlyRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevilFruitCharacterRepository extends ReadOnlyRepository<DevilFruitCharacter, Integer> {
}

package com.examples.ivmdiaz.repository.onepiece;

import com.examples.ivmdiaz.model.onepiece.DevilFruitType;
import com.examples.ivmdiaz.repository.ReadOnlyRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevilFruitTypeRepository extends ReadOnlyRepository<DevilFruitType, Integer> {
}

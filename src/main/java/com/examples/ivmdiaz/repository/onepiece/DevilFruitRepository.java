package com.examples.ivmdiaz.repository.onepiece;

import com.examples.ivmdiaz.model.onepiece.DevilFruit;
import com.examples.ivmdiaz.repository.ReadOnlyRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevilFruitRepository extends ReadOnlyRepository<DevilFruit, Integer> {
}

package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.Location;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends ReadOnlyRepository<Location, Integer> {
}

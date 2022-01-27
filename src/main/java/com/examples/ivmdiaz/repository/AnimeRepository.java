package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.Anime;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends ReadOnlyRepository<Anime, Integer> {
}

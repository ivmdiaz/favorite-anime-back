package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.CharacterSummary;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterSummaryRepository extends ReadOnlyRepository<CharacterSummary, Integer> {
}

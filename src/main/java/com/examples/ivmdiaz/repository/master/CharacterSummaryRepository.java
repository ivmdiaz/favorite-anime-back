package com.examples.ivmdiaz.repository.master;

import com.examples.ivmdiaz.model.master.CharacterSummary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterSummaryRepository extends ReadOnlyRepository<CharacterSummary, Integer> {

    @Query("select cs from CharacterSummary cs join cs.character c where c.id = :id ")
    CharacterSummary findByCharacterId(@Param("id") Integer id);
}

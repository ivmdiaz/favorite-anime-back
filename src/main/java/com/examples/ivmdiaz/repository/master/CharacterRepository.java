package com.examples.ivmdiaz.repository.master;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.examples.ivmdiaz.model.master.Character;

import java.util.List;

@Repository
public interface CharacterRepository extends ReadOnlyRepository<Character, Integer> {

    @Query("select c from Character c inner join Series a on c.seriesId = a.id where a.code = :code ")
    List<Character> findBySeriesCode(@Param("code") String code);
}

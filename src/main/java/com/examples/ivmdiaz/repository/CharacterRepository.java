package com.examples.ivmdiaz.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.examples.ivmdiaz.model.Character;

import java.util.List;

@Repository
public interface CharacterRepository extends ReadOnlyRepository<Character, Integer> {

    @Query("select c from Character c inner join Anime a on c.animeId = a.id where a.code = :code ")
    List<Character> findByAnimeCode(@Param("code") String code);
}

package com.examples.ivmdiaz.repository.master;

import com.examples.ivmdiaz.model.master.Series;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeriesRepository extends ReadOnlyRepository<Series, Integer> {

    @Query("SELECT s FROM Series s JOIN s.category c WHERE c.code = :code ")
    List<Series> findByCategoryCode(@Param("code") String code);

}

package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.Tag;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends ReadOnlyRepository<Tag, Integer> {
}

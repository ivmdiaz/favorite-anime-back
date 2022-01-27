package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.Relationship;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationshipRepository extends ReadOnlyRepository<Relationship, Integer> {
}

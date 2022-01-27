package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.CharacterGallery;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterGalleryRepository extends ReadOnlyRepository<CharacterGallery, Integer> {
}

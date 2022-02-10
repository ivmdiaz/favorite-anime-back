package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.CharacterGallery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterGalleryRepository extends ReadOnlyRepository<CharacterGallery, Integer> {

    List<CharacterGallery> findCharacterGalleriesByCharacterId(Integer characterId);

}

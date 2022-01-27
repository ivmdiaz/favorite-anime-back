package com.examples.ivmdiaz.repository;

import com.examples.ivmdiaz.model.LocationGallery;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationGalleryRepository extends ReadOnlyRepository<LocationGallery, Integer> {
}

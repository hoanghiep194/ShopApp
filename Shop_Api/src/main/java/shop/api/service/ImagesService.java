package shop.api.service;

import shop.api.domain.Images;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Images.
 */
public interface ImagesService {

    /**
     * Save a images.
     *
     * @param images the entity to save
     * @return the persisted entity
     */
    Images save(Images images);

    /**
     * Get all the images.
     *
     * @return the list of entities
     */
    List<Images> findAll();


    /**
     * Get the "id" images.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Images> findOne(Long id);

    /**
     * Delete the "id" images.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

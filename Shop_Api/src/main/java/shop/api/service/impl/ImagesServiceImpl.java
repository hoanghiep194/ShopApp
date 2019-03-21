package shop.api.service.impl;

import shop.api.service.ImagesService;
import shop.api.domain.Images;
import shop.api.repository.ImagesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing Images.
 */
@Service
@Transactional
public class ImagesServiceImpl implements ImagesService {

    private final Logger log = LoggerFactory.getLogger(ImagesServiceImpl.class);

    private final ImagesRepository imagesRepository;

    public ImagesServiceImpl(ImagesRepository imagesRepository) {
        this.imagesRepository = imagesRepository;
    }

    /**
     * Save a images.
     *
     * @param images the entity to save
     * @return the persisted entity
     */
    @Override
    public Images save(Images images) {
        log.debug("Request to save Images : {}", images);
        return imagesRepository.save(images);
    }

    /**
     * Get all the images.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Images> findAll() {
        log.debug("Request to get all Images");
        return imagesRepository.findAll();
    }


    /**
     * Get one images by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Images> findOne(Long id) {
        log.debug("Request to get Images : {}", id);
        return imagesRepository.findById(id);
    }

    /**
     * Delete the images by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Images : {}", id);
        imagesRepository.deleteById(id);
    }
}

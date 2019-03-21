package shop.api.service;

import shop.api.domain.Bill_detail;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Bill_detail.
 */
public interface Bill_detailService {

    /**
     * Save a bill_detail.
     *
     * @param bill_detail the entity to save
     * @return the persisted entity
     */
    Bill_detail save(Bill_detail bill_detail);

    /**
     * Get all the bill_details.
     *
     * @return the list of entities
     */
    List<Bill_detail> findAll();


    /**
     * Get the "id" bill_detail.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Bill_detail> findOne(Long id);

    /**
     * Delete the "id" bill_detail.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

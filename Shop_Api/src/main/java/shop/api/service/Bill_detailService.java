package shop.api.service;

import shop.api.domain.BillDetail;

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
    BillDetail save(BillDetail bill_detail);

    /**
     * Get all the bill_details.
     *
     * @return the list of entities
     */
    List<BillDetail> findAll();


    /**
     * Get the "id" bill_detail.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<BillDetail> findOne(Long id);

    /**
     * Delete the "id" bill_detail.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

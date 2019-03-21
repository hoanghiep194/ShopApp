package shop.api.service;

import shop.api.domain.Product_type;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Product_type.
 */
public interface Product_typeService {

    /**
     * Save a product_type.
     *
     * @param product_type the entity to save
     * @return the persisted entity
     */
    Product_type save(Product_type product_type);

    /**
     * Get all the product_types.
     *
     * @return the list of entities
     */
    List<Product_type> findAll();


    /**
     * Get the "id" product_type.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Product_type> findOne(Long id);

    /**
     * Delete the "id" product_type.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

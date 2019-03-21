package shop.api.service;

import java.util.List;
import java.util.Optional;

import shop.api.domain.Product;
import shop.api.service.dto.ProductDto;

/**
 * Service Interface for managing Product.
 */
public interface ProductService {

    /**
     * Save a product.
     *
     * @param product the entity to save
     * @return the persisted entity
     */
    Product save(Product product);

    /**
     * Get all the products.
     *
     * @return the list of entities
     */
    List<Product> findAll();


    /**
     * Get the "id" product.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Product> findOne(Long id);

    /**
     * Delete the "id" product.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
    
    List<ProductDto> getProducts();
}

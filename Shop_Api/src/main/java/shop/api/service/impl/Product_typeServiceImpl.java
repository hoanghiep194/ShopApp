package shop.api.service.impl;

import shop.api.service.Product_typeService;
import shop.api.domain.Product_type;
import shop.api.repository.Product_typeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing Product_type.
 */
@Service
@Transactional
public class Product_typeServiceImpl implements Product_typeService {

    private final Logger log = LoggerFactory.getLogger(Product_typeServiceImpl.class);

    private final Product_typeRepository product_typeRepository;

    public Product_typeServiceImpl(Product_typeRepository product_typeRepository) {
        this.product_typeRepository = product_typeRepository;
    }

    /**
     * Save a product_type.
     *
     * @param product_type the entity to save
     * @return the persisted entity
     */
    @Override
    public Product_type save(Product_type product_type) {
        log.debug("Request to save Product_type : {}", product_type);
        return product_typeRepository.save(product_type);
    }

    /**
     * Get all the product_types.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Product_type> findAll() {
        log.debug("Request to get all Product_types");
        return product_typeRepository.findAll();
    }


    /**
     * Get one product_type by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Product_type> findOne(Long id) {
        log.debug("Request to get Product_type : {}", id);
        return product_typeRepository.findById(id);
    }

    /**
     * Delete the product_type by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Product_type : {}", id);
        product_typeRepository.deleteById(id);
    }
}

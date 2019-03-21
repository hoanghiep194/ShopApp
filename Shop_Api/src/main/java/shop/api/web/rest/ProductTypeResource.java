package shop.api.web.rest;

import com.codahale.metrics.annotation.Timed;
import shop.api.domain.ProductType;
import shop.api.service.Product_typeService;
import shop.api.web.rest.errors.BadRequestAlertException;
import shop.api.web.rest.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Product_type.
 */
@RestController
@RequestMapping("/api")
public class ProductTypeResource {

    private final Logger log = LoggerFactory.getLogger(ProductTypeResource.class);

    private static final String ENTITY_NAME = "product_type";

    private final Product_typeService product_typeService;

    public ProductTypeResource(Product_typeService product_typeService) {
        this.product_typeService = product_typeService;
    }

    /**
     * POST  /product-types : Create a new product_type.
     *
     * @param product_type the product_type to create
     * @return the ResponseEntity with status 201 (Created) and with body the new product_type, or with status 400 (Bad Request) if the product_type has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/product-types")
    @Timed
    public ResponseEntity<ProductType> createProduct_type(@RequestBody ProductType product_type) throws URISyntaxException {
        log.debug("REST request to save Product_type : {}", product_type);
        if (product_type.getId() != null) {
            throw new BadRequestAlertException("A new product_type cannot already have an ID", ENTITY_NAME, "idexists");
        }
        ProductType result = product_typeService.save(product_type);
        return ResponseEntity.created(new URI("/api/product-types/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /product-types : Updates an existing product_type.
     *
     * @param product_type the product_type to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated product_type,
     * or with status 400 (Bad Request) if the product_type is not valid,
     * or with status 500 (Internal Server Error) if the product_type couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/product-types")
    @Timed
    public ResponseEntity<ProductType> updateProduct_type(@RequestBody ProductType product_type) throws URISyntaxException {
        log.debug("REST request to update Product_type : {}", product_type);
        if (product_type.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        ProductType result = product_typeService.save(product_type);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, product_type.getId().toString()))
            .body(result);
    }

    /**
     * GET  /product-types : get all the product_types.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of product_types in body
     */
    @GetMapping("/product-types")
    @Timed
    public List<ProductType> getAllProduct_types() {
        log.debug("REST request to get all Product_types");
        return product_typeService.findAll();
    }

    /**
     * GET  /product-types/:id : get the "id" product_type.
     *
     * @param id the id of the product_type to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the product_type, or with status 404 (Not Found)
     */
    @GetMapping("/product-types/{id}")
    @Timed
    public ResponseEntity<ProductType> getProduct_type(@PathVariable Long id) {
        log.debug("REST request to get Product_type : {}", id);
        Optional<ProductType> product_type = product_typeService.findOne(id);
        return ResponseUtil.wrapOrNotFound(product_type);
    }

    /**
     * DELETE  /product-types/:id : delete the "id" product_type.
     *
     * @param id the id of the product_type to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/product-types/{id}")
    @Timed
    public ResponseEntity<Void> deleteProduct_type(@PathVariable Long id) {
        log.debug("REST request to delete Product_type : {}", id);
        product_typeService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}

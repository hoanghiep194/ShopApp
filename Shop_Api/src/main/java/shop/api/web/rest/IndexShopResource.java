package shop.api.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;

import shop.api.domain.ProductType;
import shop.api.service.ProductService;
import shop.api.service.ProductTypeService;
import shop.api.service.dto.IndexDto;
import shop.api.service.dto.ProductDto;
import shop.api.web.rest.common.ResponseCommon;

/**
 * REST controller for managing Product.
 */
@RestController
@RequestMapping("/api")
public class IndexShopResource {

    private final Logger log = LoggerFactory.getLogger(IndexShopResource.class);

    private final ProductService productService;
    private final ProductTypeService productTypeService;
    
    public IndexShopResource(ProductService productService, ProductTypeService productTypeService) {
        this.productService = productService;
        this.productTypeService = productTypeService;
    }


    /**
     * GET  /products : get all the products.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of products in body
     * @throws Exception 
     */
    @GetMapping("/")
    @Timed
    public ResponseEntity<?> index() throws Exception {
        log.debug("REST request to get all Products");
        
        List<ProductDto> products = productService.getProducts();
        List<ProductType> productType = productTypeService.findAll();
        
        IndexDto result = new IndexDto();
        result.setProducts(products);
        result.setProductTypes(productType);
        
        return new ResponseEntity<>(ResponseCommon.createResponse(result, "N00-1"),
            HttpStatus.OK);
    }

}

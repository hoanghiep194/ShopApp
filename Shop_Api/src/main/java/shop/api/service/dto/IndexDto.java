package shop.api.service.dto;

import java.util.List;

import shop.api.domain.ProductType;

public class IndexDto {
    
    private List<ProductDto> products;
    private List<ProductType> productTypes;
    
    public List<ProductDto> getProducts() {
        return products;
    }
    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
    public List<ProductType> getProductTypes() {
        return productTypes;
    }
    public void setProductTypes(List<ProductType> productTypes) {
        this.productTypes = productTypes;
    }
    
    
}

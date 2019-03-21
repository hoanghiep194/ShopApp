package shop.api.repository;

import shop.api.domain.Product_type;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Product_type entity.
 */
@SuppressWarnings("unused")
@Repository
public interface Product_typeRepository extends JpaRepository<Product_type, Long> {

}

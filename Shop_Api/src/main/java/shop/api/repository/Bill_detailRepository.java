package shop.api.repository;

import shop.api.domain.Bill_detail;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Bill_detail entity.
 */
@SuppressWarnings("unused")
@Repository
public interface Bill_detailRepository extends JpaRepository<Bill_detail, Long> {

}

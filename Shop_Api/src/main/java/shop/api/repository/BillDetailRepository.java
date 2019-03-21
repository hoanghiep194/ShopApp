package shop.api.repository;

import shop.api.domain.BillDetail;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Bill_detail entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BillDetailRepository extends JpaRepository<BillDetail, Long> {

}

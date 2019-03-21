package shop.api.service.impl;

import shop.api.service.Bill_detailService;
import shop.api.domain.BillDetail;
import shop.api.repository.BillDetailRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing Bill_detail.
 */
@Service
@Transactional
public class Bill_detailServiceImpl implements Bill_detailService {

    private final Logger log = LoggerFactory.getLogger(Bill_detailServiceImpl.class);

    private final BillDetailRepository bill_detailRepository;

    public Bill_detailServiceImpl(BillDetailRepository bill_detailRepository) {
        this.bill_detailRepository = bill_detailRepository;
    }

    /**
     * Save a bill_detail.
     *
     * @param bill_detail the entity to save
     * @return the persisted entity
     */
    @Override
    public BillDetail save(BillDetail bill_detail) {
        log.debug("Request to save Bill_detail : {}", bill_detail);
        return bill_detailRepository.save(bill_detail);
    }

    /**
     * Get all the bill_details.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<BillDetail> findAll() {
        log.debug("Request to get all Bill_details");
        return bill_detailRepository.findAll();
    }


    /**
     * Get one bill_detail by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<BillDetail> findOne(Long id) {
        log.debug("Request to get Bill_detail : {}", id);
        return bill_detailRepository.findById(id);
    }

    /**
     * Delete the bill_detail by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Bill_detail : {}", id);
        bill_detailRepository.deleteById(id);
    }
}

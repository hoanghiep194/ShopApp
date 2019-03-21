package shop.api.service.impl;

import shop.api.service.BillService;
import shop.api.domain.Bill;
import shop.api.repository.BillRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing Bill.
 */
@Service
@Transactional
public class BillServiceImpl implements BillService {

    private final Logger log = LoggerFactory.getLogger(BillServiceImpl.class);

    private final BillRepository billRepository;

    public BillServiceImpl(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    /**
     * Save a bill.
     *
     * @param bill the entity to save
     * @return the persisted entity
     */
    @Override
    public Bill save(Bill bill) {
        log.debug("Request to save Bill : {}", bill);
        return billRepository.save(bill);
    }

    /**
     * Get all the bills.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Bill> findAll() {
        log.debug("Request to get all Bills");
        return billRepository.findAll();
    }


    /**
     * Get one bill by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Bill> findOne(Long id) {
        log.debug("Request to get Bill : {}", id);
        return billRepository.findById(id);
    }

    /**
     * Delete the bill by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Bill : {}", id);
        billRepository.deleteById(id);
    }
}

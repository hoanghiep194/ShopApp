package shop.api.web.rest;

import com.codahale.metrics.annotation.Timed;
import shop.api.domain.Bill_detail;
import shop.api.service.Bill_detailService;
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
 * REST controller for managing Bill_detail.
 */
@RestController
@RequestMapping("/api")
public class Bill_detailResource {

    private final Logger log = LoggerFactory.getLogger(Bill_detailResource.class);

    private static final String ENTITY_NAME = "bill_detail";

    private final Bill_detailService bill_detailService;

    public Bill_detailResource(Bill_detailService bill_detailService) {
        this.bill_detailService = bill_detailService;
    }

    /**
     * POST  /bill-details : Create a new bill_detail.
     *
     * @param bill_detail the bill_detail to create
     * @return the ResponseEntity with status 201 (Created) and with body the new bill_detail, or with status 400 (Bad Request) if the bill_detail has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/bill-details")
    @Timed
    public ResponseEntity<Bill_detail> createBill_detail(@RequestBody Bill_detail bill_detail) throws URISyntaxException {
        log.debug("REST request to save Bill_detail : {}", bill_detail);
        if (bill_detail.getId() != null) {
            throw new BadRequestAlertException("A new bill_detail cannot already have an ID", ENTITY_NAME, "idexists");
        }
        Bill_detail result = bill_detailService.save(bill_detail);
        return ResponseEntity.created(new URI("/api/bill-details/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /bill-details : Updates an existing bill_detail.
     *
     * @param bill_detail the bill_detail to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated bill_detail,
     * or with status 400 (Bad Request) if the bill_detail is not valid,
     * or with status 500 (Internal Server Error) if the bill_detail couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/bill-details")
    @Timed
    public ResponseEntity<Bill_detail> updateBill_detail(@RequestBody Bill_detail bill_detail) throws URISyntaxException {
        log.debug("REST request to update Bill_detail : {}", bill_detail);
        if (bill_detail.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        Bill_detail result = bill_detailService.save(bill_detail);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, bill_detail.getId().toString()))
            .body(result);
    }

    /**
     * GET  /bill-details : get all the bill_details.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of bill_details in body
     */
    @GetMapping("/bill-details")
    @Timed
    public List<Bill_detail> getAllBill_details() {
        log.debug("REST request to get all Bill_details");
        return bill_detailService.findAll();
    }

    /**
     * GET  /bill-details/:id : get the "id" bill_detail.
     *
     * @param id the id of the bill_detail to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the bill_detail, or with status 404 (Not Found)
     */
    @GetMapping("/bill-details/{id}")
    @Timed
    public ResponseEntity<Bill_detail> getBill_detail(@PathVariable Long id) {
        log.debug("REST request to get Bill_detail : {}", id);
        Optional<Bill_detail> bill_detail = bill_detailService.findOne(id);
        return ResponseUtil.wrapOrNotFound(bill_detail);
    }

    /**
     * DELETE  /bill-details/:id : delete the "id" bill_detail.
     *
     * @param id the id of the bill_detail to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/bill-details/{id}")
    @Timed
    public ResponseEntity<Void> deleteBill_detail(@PathVariable Long id) {
        log.debug("REST request to delete Bill_detail : {}", id);
        bill_detailService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}

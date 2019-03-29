package shop.api.web.rest;

import com.codahale.metrics.annotation.Timed;
import shop.api.domain.BillDetail;
import shop.api.service.BillDetailService;
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
 * REST controller for managing billDetail.
 */
@RestController
@RequestMapping("/api")
public class BillDetailResource {

    private final Logger log = LoggerFactory.getLogger(BillDetailResource.class);

    private static final String ENTITY_NAME = "bill_detail";

    private final BillDetailService billDetailService;

    public BillDetailResource(BillDetailService billDetailService) {
        this.billDetailService = billDetailService;
    }

    /**
     * POST  /bill-details : Create a new billDetail.
     *
     * @param billDetail the billDetail to create
     * @return the ResponseEntity with status 201 (Created) and with body the new billDetail, or with status 400 (Bad Request) if the billDetail has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/bill-details")
    @Timed
    public ResponseEntity<BillDetail> createbillDetail(@RequestBody BillDetail billDetail) throws URISyntaxException {
        log.debug("REST request to save billDetail : {}", billDetail);
        if (billDetail.getId() != null) {
            throw new BadRequestAlertException("A new billDetail cannot already have an ID", ENTITY_NAME, "idexists");
        }
        BillDetail result = billDetailService.save(billDetail);
        return ResponseEntity.created(new URI("/api/bill-details/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /bill-details : Updates an existing billDetail.
     *
     * @param billDetail the billDetail to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated billDetail,
     * or with status 400 (Bad Request) if the billDetail is not valid,
     * or with status 500 (Internal Server Error) if the billDetail couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/bill-details")
    @Timed
    public ResponseEntity<BillDetail> updatebillDetail(@RequestBody BillDetail billDetail) throws URISyntaxException {
        log.debug("REST request to update billDetail : {}", billDetail);
        if (billDetail.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        BillDetail result = billDetailService.save(billDetail);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, billDetail.getId().toString()))
            .body(result);
    }

    /**
     * GET  /bill-details : get all the billDetails.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of billDetails in body
     */
    @GetMapping("/bill-details")
    @Timed
    public List<BillDetail> getAllbillDetails() {
        log.debug("REST request to get all billDetails");
        return billDetailService.findAll();
    }

    /**
     * GET  /bill-details/:id : get the "id" billDetail.
     *
     * @param id the id of the billDetail to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the billDetail, or with status 404 (Not Found)
     */
    @GetMapping("/bill-details/{id}")
    @Timed
    public ResponseEntity<BillDetail> getbillDetail(@PathVariable Long id) {
        log.debug("REST request to get billDetail : {}", id);
        Optional<BillDetail> billDetail = billDetailService.findOne(id);
        return ResponseUtil.wrapOrNotFound(billDetail);
    }

    /**
     * DELETE  /bill-details/:id : delete the "id" billDetail.
     *
     * @param id the id of the billDetail to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/bill-details/{id}")
    @Timed
    public ResponseEntity<Void> deletebillDetail(@PathVariable Long id) {
        log.debug("REST request to delete billDetail : {}", id);
        billDetailService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}

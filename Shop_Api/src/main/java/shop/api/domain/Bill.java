package shop.api.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A Bill.
 */
@Entity
@Table(name = "bill")
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_customer")
    private Long idCustomer;

    @Column(name = "date_order")
    private ZonedDateTime dateOrder;

    @Column(name = "total")
    private Float total;

    @Lob
    @Column(name = "note")
    private String note;

    @Column(name = "status")
    private Integer status;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public Bill idCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
        return this;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public ZonedDateTime getDateOrder() {
        return dateOrder;
    }

    public Bill dateOrder(ZonedDateTime dateOrder) {
        this.dateOrder = dateOrder;
        return this;
    }

    public void setDateOrder(ZonedDateTime dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Float getTotal() {
        return total;
    }

    public Bill total(Float total) {
        this.total = total;
        return this;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getNote() {
        return note;
    }

    public Bill note(String note) {
        this.note = note;
        return this;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getStatus() {
        return status;
    }

    public Bill status(Integer status) {
        this.status = status;
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bill bill = (Bill) o;
        if (bill.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), bill.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Bill{" +
            "id=" + getId() +
            ", idCustomer=" + getIdCustomer() +
            ", dateOrder='" + getDateOrder() + "'" +
            ", total=" + getTotal() +
            ", note='" + getNote() + "'" +
            ", status=" + getStatus() +
            "}";
    }
}

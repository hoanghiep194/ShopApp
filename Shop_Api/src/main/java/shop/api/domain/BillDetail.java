package shop.api.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Bill_detail.
 */
@Entity
@Table(name = "bill_detail")
public class BillDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_bill")
    private Long idBill;

    @Column(name = "id_product")
    private Long idProduct;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Float price;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdBill() {
        return idBill;
    }

    public BillDetail idBill(Long idBill) {
        this.idBill = idBill;
        return this;
    }

    public void setIdBill(Long idBill) {
        this.idBill = idBill;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public BillDetail idProduct(Long idProduct) {
        this.idProduct = idProduct;
        return this;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public BillDetail quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public BillDetail price(Float price) {
        this.price = price;
        return this;
    }

    public void setPrice(Float price) {
        this.price = price;
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
        BillDetail bill_detail = (BillDetail) o;
        if (bill_detail.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), bill_detail.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Bill_detail{" +
            "id=" + getId() +
            ", idBill=" + getIdBill() +
            ", idProduct=" + getIdProduct() +
            ", quantity=" + getQuantity() +
            ", price=" + getPrice() +
            "}";
    }
}

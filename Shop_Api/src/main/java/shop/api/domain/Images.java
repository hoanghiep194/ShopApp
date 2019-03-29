package shop.api.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Images.
 */
@Entity
@Table(name = "images")
public class Images implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "jhi_link")
    private String link;

    @Column(name = "id_product")
    private Long idProduct;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public Images link(String link) {
        this.link = link;
        return this;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public Images idProduct(Long idProduct) {
        this.idProduct = idProduct;
        return this;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
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
        Images images = (Images) o;
        if (images.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), images.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Images{" +
            "id=" + getId() +
            ", link='" + getLink() + "'" +
            ", idProduct=" + getIdProduct() +
            "}";
    }
}

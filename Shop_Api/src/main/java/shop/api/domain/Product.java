package shop.api.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Product.
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "id_type")
    private Integer idType;

    @Column(name = "price")
    private Float price;

    @Column(name = "color")
    private String color;

    @Column(name = "material")
    private String material;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "new")
    private Integer prodNew;

    @Column(name = "in_collection")
    private Integer inCollection;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Product name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdType() {
        return idType;
    }

    public Product idType(Integer idType) {
        this.idType = idType;
        return this;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public Float getPrice() {
        return price;
    }

    public Product price(Float price) {
        this.price = price;
        return this;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public Product color(String color) {
        this.color = color;
        return this;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public Product material(String material) {
        this.material = material;
        return this;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescription() {
        return description;
    }

    public Product description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getProdNew() {
        return prodNew;
    }

    public Product prodNew(Integer prodNew) {
        this.prodNew = prodNew;
        return this;
    }

    public void setProdNew(Integer prodNew) {
        this.prodNew = prodNew;
    }

    public Integer getInCollection() {
        return inCollection;
    }

    public Product inCollection(Integer inCollection) {
        this.inCollection = inCollection;
        return this;
    }

    public void setInCollection(Integer inCollection) {
        this.inCollection = inCollection;
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
        Product product = (Product) o;
        if (product.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", idType='" + getIdType() + "'" +
            ", price=" + getPrice() +
            ", color='" + getColor() + "'" +
            ", material='" + getMaterial() + "'" +
            ", description='" + getDescription() + "'" +
            ", prodNew=" + getProdNew() +
            ", inCollection=" + getInCollection() +
            "}";
    }
}

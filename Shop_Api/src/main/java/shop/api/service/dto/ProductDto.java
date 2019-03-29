package shop.api.service.dto;

public class ProductDto {

    private Long id;
    private String name;
    private Integer idType;
    private String nameType;
    private Float price;
    private String color;
    private String material;
    private String description;
    private String images;
    
    public ProductDto(Long id, String name, Integer idType, String nameType, Float price, String color, String material,
        String description, String images) {
        super();
        this.id = id;
        this.name = name;
        this.idType = idType;
        this.nameType = nameType;
        this.price = price;
        this.color = color;
        this.material = material;
        this.description = description;
        this.images = images;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
    
}

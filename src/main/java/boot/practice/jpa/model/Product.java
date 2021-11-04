package boot.practice.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "B2C_PRODUCT")
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product implements Serializable {

    @Id
    private Long id;
    private String name;
    private Integer quantity;
    private String size;
    private Double price;

    @Column(name = "FK_BRAND_ID")
    private Integer brandId;

    @Column(name = "FK_COLOR_ID")
    private Integer colorId;

    @Column(name = "FK_PRODUCT_CTGR_ID")
    private Integer catagoryId;

    @JsonIgnoreProperties(value = {"products", "hibernateLazyInitializer"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(insertable = false, updatable = false, name = "FK_BRAND_ID")
    private Brand brand;

    @JsonIgnoreProperties(value = {"products", "hibernateLazyInitializer"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(insertable = false, updatable = false, name = "FK_COLOR_ID")
    private Color color;

    @JsonIgnoreProperties(value = {"products", "hibernateLazyInitializer"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(insertable = false, updatable = false, name = "FK_PRODUCT_CTGR_ID")
    private ProductCategory productCategory;

}

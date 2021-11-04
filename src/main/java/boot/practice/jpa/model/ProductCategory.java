package boot.practice.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "B2C_PRODUCT_CATEGORY")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @JsonIgnoreProperties("productCategory")
    @OneToMany(mappedBy = "productCategory", fetch = FetchType.LAZY)
    private Set<Product> products;

}

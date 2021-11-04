package boot.practice.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "B2C_COLOR")
@Data
@NoArgsConstructor
public class Color implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String code;

    @JsonIgnoreProperties("color")
    @OneToMany(mappedBy = "color", fetch = FetchType.LAZY)
    private Set<Product> products;
}

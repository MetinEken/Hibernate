package Eken.Hibernate.model.productModel;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
private String name;
private double preice;
private double oldPreice;
private boolean isExist;
private boolean isShow;

}

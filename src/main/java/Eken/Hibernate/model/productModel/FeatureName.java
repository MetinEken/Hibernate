package Eken.Hibernate.model.productModel;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class FeatureName {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

  private String name;



}

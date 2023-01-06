package Eken.Hibernate.model.userModel;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
private String userName;
private String email;
private String firstName;
private String lastNAme;

//@JoinColumn
//Set<UserRole> userRole = new HashSet<>();


}

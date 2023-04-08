package ma.emsi.springjpa.entities;

import jakarta.persistence.*;
import lombok.*;


import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Etudiant {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name="NAME", length = 30, nullable = false)
    private String name;
    @Temporal(TemporalType.DATE)
    private Date datenaissance;
    @Column(name ="CNE", unique = true)
    private Integer Cne;
}

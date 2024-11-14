package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idF ;
    private String nomF;
    private Long capaciteF ;
    @OneToOne(mappedBy="foyer")
    private Universite universite ;
    @OneToMany(mappedBy="foyer",cascade = CascadeType.ALL)
    private Set<Bloc> blocs ;

}
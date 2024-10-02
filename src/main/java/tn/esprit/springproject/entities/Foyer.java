package tn.esprit.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idF ;
    private String nomF;
    private Long capaciteF ;
    @OneToOne(mappedBy="foyer")
    private Universite universite ;
    @OneToMany(mappedBy="foyer")
    private Set<Bloc> blocs ;

}
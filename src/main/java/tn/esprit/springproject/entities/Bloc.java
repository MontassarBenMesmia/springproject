package tn.esprit.springproject.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idB ;
    private String nomB;
    private Long capaciteB ;
    @ManyToOne()
    private Foyer foyer;
    @OneToMany(mappedBy = "bloc")
    private Set<Chambre> chambres;

}
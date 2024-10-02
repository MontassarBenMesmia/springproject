package tn.esprit.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idC;
    private Long numC ;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @OneToMany
    private Set<Reservation> reservations;
    @ManyToOne
    private Bloc bloc;


}
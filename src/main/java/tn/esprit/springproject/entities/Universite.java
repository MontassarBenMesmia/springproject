package tn.esprit.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idU ;
    private String nomU ;
    private String adresse ;
    @OneToOne
    private Foyer foyer;
}
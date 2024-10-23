package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idU ;
    private String nomU ;
    private String adresse ;
    @OneToOne
    private Foyer foyer;
}
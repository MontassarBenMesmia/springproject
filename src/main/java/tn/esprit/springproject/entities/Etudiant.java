package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idE;
    private String nomE;
    private String prenomE;
    private Long cin ;
    private String ecole ;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance ;
    @ManyToMany(mappedBy="etudiants")
    @ToString.Exclude
    @JsonIgnore
    private Set<Reservation> reservations;
}
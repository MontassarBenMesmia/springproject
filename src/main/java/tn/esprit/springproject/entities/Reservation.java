package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Reservation implements Serializable {
    @Id
    private String idR ;
    @Temporal(TemporalType.DATE)

    private Date anneeUniv ;
    private Boolean estValide ;
    @ManyToMany
    private Set<Etudiant> etudiants;

}
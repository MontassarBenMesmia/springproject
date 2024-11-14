package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore //X boucle dans l'affichage
    private Bloc bloc;


}
package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Etudiant;

import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    public List<Etudiant> findByEcoleAndDateNaissanceGreaterThan(String ecole , Date date);
}
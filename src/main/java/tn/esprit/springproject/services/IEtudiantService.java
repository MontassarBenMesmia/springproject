package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.entities.Foyer;

import java.util.List;

public interface IEtudiantService {
    public Etudiant addEtudiant(Etudiant etudiant);
    public Etudiant updateEtudiant(Etudiant etudiant);
    public List<Etudiant> retrieveAllEtudiant();
    public Etudiant retrieveEtudiantById(Long idE);
    public void deleteEtudiantById(Long idE);
}
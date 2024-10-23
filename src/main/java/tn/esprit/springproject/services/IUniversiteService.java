package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    public Universite addUniversite(Universite universite);
    public Universite updateUniversite(Universite universite);
    public List<Universite> retrieveAllUniversite();
    public Universite retrieveUniversiteById(Long idU);
    public void deleteUniversiteById(Long idU);
    public Universite affecterFoyerAUniversite(Long idF, Long idU);
}
package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Foyer;

import java.util.List;

public interface IFoyerService {

   public Foyer addFoyer(Foyer foyer);
   public Foyer updateFoyer(Foyer foyer);
   public List<Foyer> retrieveAllFoyer();
   public Foyer retrieveFoyerById(Long idF);
   public void deleteFoyerById(Long idF);
   public Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, Long idU) ;
   public Foyer getFoyerByNom(String nomF);

}
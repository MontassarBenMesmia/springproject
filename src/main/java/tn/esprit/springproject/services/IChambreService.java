package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public Chambre addChambre(Chambre chambre);
    public Chambre updateChambre(Chambre chambre);
    public List<Chambre> retrieveAllChambre();
    public Chambre retrieveChambreById(Long idC);
    public void deleteChambreById(Long idC);
}
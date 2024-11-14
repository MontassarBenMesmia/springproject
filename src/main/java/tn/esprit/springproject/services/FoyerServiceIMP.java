package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Universite;
import tn.esprit.springproject.repositories.FoyerRepository;
import tn.esprit.springproject.repositories.UniversiteRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class FoyerServiceIMP implements IFoyerService{
    private FoyerRepository foyerRepository ;
    private UniversiteRepository universiteRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> retrieveAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyerById(Long idF) {
        return foyerRepository.findById(idF).orElse(null);
    }

    @Override
    public void deleteFoyerById(Long idF) {
        foyerRepository.deleteById(idF);
    }

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, Long idU) {
        Universite u = universiteRepository.findById(idU).orElse(null);
        foyer.getBlocs().forEach(e->e.setFoyer(foyer));
        Foyer savedfoyer = foyerRepository.save(foyer);
        u.setFoyer(savedfoyer);
        universiteRepository.save(u);
        return savedfoyer;
    }

    @Override
    public Foyer getFoyerByNom(String nomF) {
        return foyerRepository.findByNomF(nomF);
    }
}
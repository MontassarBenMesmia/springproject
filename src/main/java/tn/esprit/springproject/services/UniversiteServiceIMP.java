package tn.esprit.springproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Universite;
import tn.esprit.springproject.repositories.FoyerRepository;
import tn.esprit.springproject.repositories.UniversiteRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UniversiteServiceIMP implements IUniversiteService{
    private final UniversiteRepository universiteRepository;
    private final FoyerRepository foyerRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversiteById(Long idU) {
        return universiteRepository.findById(idU).orElse(null);
    }

    @Override
    public void deleteUniversiteById(Long idU) {
        universiteRepository.deleteById(idU);
    }

    @Override
    public Universite affecterFoyerAUniversite(Long idF, Long idU) {
        Foyer f = foyerRepository.findById(idF).orElse(null);
        Universite u = universiteRepository.findById(idU).orElse(null);
        u.setFoyer(f);

        return universiteRepository.save(u);
    }

    @Override
    public Universite desaffecterFoyerFromUniversite(Long idU) {
        Universite u = universiteRepository.findById(idU).orElse(null);
        u.setFoyer(null);
        return universiteRepository.save(u);
    }

}
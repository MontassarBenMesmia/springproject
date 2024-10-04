package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.repositories.FoyerRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class FoyerServiceIMP implements IFoyerService{

    private FoyerRepository foyerRepository;
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
}

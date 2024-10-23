
package tn.esprit.springproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.repositories.ChambreRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChambreServiceIMP implements IChambreService{
    private final ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> retrieveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambreById(Long idC) {
        return chambreRepository.findById(idC).orElse(null);
    }

    @Override
    public void deleteChambreById(Long idC) {
        chambreRepository.deleteById(idC);
    }
}

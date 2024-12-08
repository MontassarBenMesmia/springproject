package tn.esprit.springproject.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.repositories.BlocRepository;
import tn.esprit.springproject.repositories.ChambreRepository;
import tn.esprit.springproject.repositories.EtudiantRepository;
import tn.esprit.springproject.repositories.FoyerRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class BlocServiceIMP implements IBlocService {
    private BlocRepository blocRepository;
    private ChambreRepository chambreRepository;
    private FoyerRepository foyerRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> retrieveAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBlocById(Long idB) {
        return blocRepository.findById(idB).orElse(null);
    }

    @Override
    public void deleteBlocById(Long idB) {
        blocRepository.deleteById(idB);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numC, Long idB) {
        Bloc b = blocRepository.findById(idB).orElse(null);
        List<Chambre> chambres = chambreRepository.findAllById(numC);
        chambres.forEach(e->e.setBloc(b));
        chambreRepository.saveAll(chambres);
        return b;
    }

    @Override
    public Bloc affecterBlocAFoyer(Long idB, Long idF) {
        Bloc b = blocRepository.findById(idB).orElse(null);
        Foyer f = foyerRepository.findById(idF).orElse(null);
        b.setFoyer(f);
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> getBlocByCapacite(Long capacite) {
        return blocRepository.findByCapaciteB(capacite);
    }

    @Transactional
    public void assignBlocToFoyerUsingJPQL(Long blocId, Long foyerId) {
        // Récupérer le Foyer par son ID
        Foyer foyer = foyerRepository.findById(foyerId)
                .orElseThrow(() -> new EntityNotFoundException("Foyer introuvable avec l'ID : " + foyerId));

        // Utiliser JPQL pour mettre à jour le Bloc
        int updatedRows = blocRepository.assignBlocToFoyer(blocId, foyer);

        if (updatedRows == 0) {
            throw new EntityNotFoundException("Bloc introuvable avec l'ID : " + blocId);
        }
    }
}
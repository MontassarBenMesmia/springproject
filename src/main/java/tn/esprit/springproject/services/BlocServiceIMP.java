package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.repositories.BlocRepository;
import tn.esprit.springproject.repositories.EtudiantRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class BlocServiceIMP implements IBlocService {
    private BlocRepository blocRepository;

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
}
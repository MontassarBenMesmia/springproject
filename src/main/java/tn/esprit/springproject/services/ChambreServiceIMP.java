package tn.esprit.springproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.TypeChambre;
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

    @Override
    public List<Chambre> getChambreByType(TypeChambre typeChambre) {
        return chambreRepository.getChambreByType(typeChambre);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(Long idB, TypeChambre typeChambre) {
        //Keyword  //   return  chambreRepository.findByBloc_IdBAndTypeC(idB,typeChambre);
        //JPQL
        return chambreRepository.getChambreByBlocAndTypeC(idB,typeChambre);
    }


    public List<Chambre> findChambresByStudentCin(Long cin) {
        return chambreRepository.trouverChselonEt(cin);
    }
}
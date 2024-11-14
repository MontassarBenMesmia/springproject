package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Etudiant;

import java.util.List;

public interface IBlocService {
    public Bloc addBloc(Bloc bloc);
    public Bloc updateBloc(Bloc bloc);
    public List<Bloc> retrieveAllBloc();
    public Bloc retrieveBlocById(Long idB);
    public void deleteBlocById(Long idB);
    public Bloc affecterChambresABloc(List<Long> numC, Long idB) ;
    public Bloc affecterBlocAFoyer (Long idB, Long idF) ;
    public List<Bloc> getBlocByCapacite(Long capacite);

}
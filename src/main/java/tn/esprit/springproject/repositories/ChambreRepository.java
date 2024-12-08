package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    @Query("select c from Chambre c where c.typeC=:typeChambre")
    public List<Chambre> getChambreByType(@Param("typeChambre") TypeChambre typeChambre);
    //KEYWORD
    public List<Chambre> findByBloc_IdBAndTypeC(Long idB,TypeChambre typeChambre);
    //JPQL
    @Query("select c from Chambre c where c.bloc.idB=:idB and c.typeC=:typeChambre")
    public List<Chambre> getChambreByBlocAndTypeC(@Param("idB") Long idB,@Param("typeChambre") TypeChambre typeChambre);

    //Recuperer les chambres selon le cin de l'etudiant
    @Query("SELECT ch from Chambre ch " +
    "INNER JOIN ch.reservations r " +
    "INNER JOIN r.etudiants e " +
    "WHERE e.cin=:cin ")
    List<Chambre> trouverChselonEt(Long cin);

}
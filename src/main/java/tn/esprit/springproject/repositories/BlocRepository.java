package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Foyer;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    public List<Bloc> findByCapaciteB(Long capacite);

    @Modifying
    @Query("UPDATE Bloc b SET b.foyer = :foyer WHERE b.idB = :blocId")
    int assignBlocToFoyer(@Param("blocId") Long blocId, @Param("foyer") Foyer foyer);
}
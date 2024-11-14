package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Bloc;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    public List<Bloc> findByCapaciteB(Long capacite);
}
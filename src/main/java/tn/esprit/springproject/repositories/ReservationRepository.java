package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Reservation;

import java.time.LocalDate;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    public long countByDateDebutBetween(LocalDate date1,LocalDate date2);
}
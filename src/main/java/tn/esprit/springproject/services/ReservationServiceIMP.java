package tn.esprit.springproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Reservation;
import tn.esprit.springproject.repositories.ReservationRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReservationServiceIMP implements IReservationService {
    private final ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservationById(String idR) {
        return reservationRepository.findById(idR).orElse(null);
    }

    @Override
    public void deleteReservationById(String idR) {
        reservationRepository.deleteById(idR);
    }
}
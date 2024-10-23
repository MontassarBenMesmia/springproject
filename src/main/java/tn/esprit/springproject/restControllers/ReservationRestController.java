package tn.esprit.springproject.restControllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Reservation;
import tn.esprit.springproject.services.IReservationService;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class ReservationRestController {
    private final IReservationService iReservationService;
    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation chambre) {
        return iReservationService.addReservation(chambre);
    }
    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation chambre) {
        return iReservationService.updateReservation(chambre);
    }
    @GetMapping("/getAllReservation")
    public List<Reservation> retrieveAllReservation() {
        return iReservationService.retrieveAllReservation();
    }
    @GetMapping("/findReservationById/{idC}")
    public Reservation retrieveReservationById(@PathVariable String idC) {
        return iReservationService.retrieveReservationById(idC);
    }
    @DeleteMapping("deleteReservationById/{idC}")
    public void deleteReservationById(@PathVariable String idC) {
        iReservationService.deleteReservationById(idC);
    }
}
package tn.esprit.springproject.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.services.IEtudiantService;

import java.util.List;

@RestController
public class EtudiantRestController {
    @Autowired
    private IEtudiantService iEtudiantService;
    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return iEtudiantService.addEtudiant(etudiant);
    }
    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return iEtudiantService.updateEtudiant(etudiant);
    }
    @GetMapping("/getAllEtudiant")
    public List<Etudiant> retrieveAllEtudiant() {
        return iEtudiantService.retrieveAllEtudiant();
    }
    @GetMapping("/findEtudiantById/{idE}")
    public Etudiant retrieveEtudiantById(@PathVariable Long idE) {
        return iEtudiantService.retrieveEtudiantById(idE);
    }
    @DeleteMapping("deleteEtudiantById/{idE}")
    public void deleteEtudiantById(@PathVariable Long idE) {
        iEtudiantService.deleteEtudiantById(idE);
    }
}
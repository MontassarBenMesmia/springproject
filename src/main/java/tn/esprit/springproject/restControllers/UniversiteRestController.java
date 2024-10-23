package tn.esprit.springproject.restControllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Universite;
import tn.esprit.springproject.services.IUniversiteService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UniversiteRestController {
    private final IUniversiteService iUniversiteService;
    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return iUniversiteService.addUniversite(universite);
    }
    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return iUniversiteService.updateUniversite(universite);
    }
    @GetMapping("/getAllUniversite")
    public List<Universite> retrieveAllUniversite() {
        return iUniversiteService.retrieveAllUniversite();
    }
    @GetMapping("/findUniversiteById/{idU}")
    public Universite retrieveUniversiteById(@PathVariable Long idU) {
        return iUniversiteService.retrieveUniversiteById(idU);
    }
    @DeleteMapping("deleteUniversiteById/{idU}")
    public void deleteUniversiteById(@PathVariable Long idU) {
        iUniversiteService.deleteUniversiteById(idU);
    }
    @PostMapping("/affecterFoyerAUniversite/{idF}/{idU}")
    public Universite affecterFoyerAUniversite(@PathVariable Long idF,@PathVariable Long idU){
        return iUniversiteService.affecterFoyerAUniversite(idF,idU);
    }

}
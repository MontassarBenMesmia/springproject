package tn.esprit.springproject.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.services.FoyerServiceIMP;
import tn.esprit.springproject.services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoyerRestController {
    private IFoyerService iFoyerService;
    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return iFoyerService.addFoyer(foyer);
    }
    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return iFoyerService.updateFoyer(foyer);
    }
    @GetMapping("/getAllFoyer")
    public List<Foyer> retrieveAllFoyer() {
        return iFoyerService.retrieveAllFoyer();
    }
    @GetMapping("/findFoyerById/{idF}")
    public Foyer retrieveFoyerById(@PathVariable Long idF) {
        return iFoyerService.retrieveFoyerById(idF);
    }
    @DeleteMapping("deleteFoyerById/{idF}")
    public void deleteFoyerById(@PathVariable Long idF) {
        iFoyerService.deleteFoyerById(idF);
    }
    @PostMapping("ajouterFoyerEtAffecterAUniversite/{idU}")
    public Foyer ajouterFoyerEtAffecterAUniversite (@RequestBody Foyer foyer,@PathVariable Long idU) {
        return   iFoyerService.ajouterFoyerEtAffecterAUniversite(foyer,idU);

    }
    @GetMapping("getFoyerByNom/{nomF}")
    public  Foyer getFoyerByNom(@PathVariable String nomF){
        return  iFoyerService.getFoyerByNom(nomF);
    }

}
package tn.esprit.springproject.restControllers;

import jakarta.servlet.http.PushBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.TypeChambre;
import tn.esprit.springproject.entities.Universite;
import tn.esprit.springproject.services.IChambreService;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class ChambreRestController {
    private final IChambreService iChambreService;
    @PostMapping("/addChambre")
    public Chambre addUniversite(@RequestBody Chambre chambre) {
        return iChambreService.addChambre(chambre);
    }
    @PutMapping("/updateChambre")
    public Chambre updateUniversite(@RequestBody Chambre chambre) {
        return iChambreService.updateChambre(chambre);
    }
    @GetMapping("/getAllChambre")
    public List<Chambre> retrieveAllChambre() {
        return iChambreService.retrieveAllChambre();
    }
    @GetMapping("/findChambreById/{idC}")
    public Chambre retrieveChambreById(@PathVariable Long idC) {
        return iChambreService.retrieveChambreById(idC);
    }
    @DeleteMapping("deleteChambreById/{idC}")
    public void deleteChambreById(@PathVariable Long idC) {
        iChambreService.deleteChambreById(idC);
    }
    @GetMapping("getChambreByType/{typeChambre}")
    public List<Chambre> getChambreByType(@PathVariable TypeChambre typeChambre){
        return iChambreService.getChambreByType(typeChambre);
    }
    @GetMapping("getChambresParBlocEtType/{idB}/{typeChambre}")
    public List<Chambre> getChambresParBlocEtType(@PathVariable Long idB,@PathVariable TypeChambre typeChambre){
        return iChambreService.getChambresParBlocEtType(idB,typeChambre);

    }
}
package tn.esprit.springproject.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    private IBlocService iBlocService;
    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return iBlocService.addBloc(bloc);
    }
    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return iBlocService.updateBloc(bloc);
    }
    @GetMapping("/getAllBloc")
    public List<Bloc> retrieveAllBloc() {
        return iBlocService.retrieveAllBloc();
    }
    @GetMapping("/findBlocById/{idB}")
    public Bloc retrieveBlocById(@PathVariable Long idB) {
        return iBlocService.retrieveBlocById(idB);
    }
    @DeleteMapping("deleteBlocById/{idB}")
    public void deleteBlocById(@PathVariable Long idB) {
        iBlocService.deleteBlocById(idB);
    }
}
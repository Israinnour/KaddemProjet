package tn.esprit.kaddemprojet.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddemprojet.entities.Etudiant;
import tn.esprit.kaddemprojet.services.IEtudiantServices;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@RequiredArgsConstructor
public class EtudiantRestController {
    private final IEtudiantServices etudiantService;

    @GetMapping("/all")
    public List<Etudiant> getAllEtudiants(){
        return etudiantService.retrieveAllEtudiants();
    }
    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantService.addEtudiant(e);
    }


}

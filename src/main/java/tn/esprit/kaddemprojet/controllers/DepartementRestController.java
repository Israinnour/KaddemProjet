package tn.esprit.kaddemprojet.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddemprojet.entities.Departement;
import tn.esprit.kaddemprojet.services.IDepartementServices;

import java.util.List;

@RestController
@RequestMapping("/departement")
@RequiredArgsConstructor
public class DepartementRestController {
    private final IDepartementServices departementService;

    @GetMapping("/all")
    public List<Departement> getAllDepartement() {
        return departementService.retrieveAllDepartements();
    }

    @PostMapping("/addDep")
    public Departement addDepartement(@RequestBody Departement d) {
        return departementService.addDepartement(d);
    }

    @PutMapping("/update")
    public Departement updateDepartement(@RequestBody Departement d) {
        return departementService.updateDepartement(d);
    }

    @GetMapping("get/{idD}")
    public Departement getById(@PathVariable("idD") Integer idDepart) {
        return departementService.retrieveDepartement(idDepart);
    }

    @PutMapping("/update/{idEtud}/{idDep}")
    public void updateaffectDep(@PathVariable("idEtud") Integer etudiantId, @PathVariable("idDep") Integer departementId) {

        departementService.assignEtudiantToDepartement(etudiantId, departementId);
    }

    @PutMapping("/updateUD/{idUniv}/{idDep}")
    public void updateaffectUnivDep(@PathVariable("idUniv") Integer idUniversite, @PathVariable("idDep") Integer departementId) {

        departementService.assignUniversiteToDepartement(idUniversite, departementId);
    }


}

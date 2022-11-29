package tn.esprit.kaddemprojet.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddemprojet.entities.Universite;
import tn.esprit.kaddemprojet.services.IUniversiteServices;

import java.util.List;

@RestController
@RequestMapping("/universite")
@RequiredArgsConstructor
public class UniversiteRestController {
    private final IUniversiteServices universiteService;

    @GetMapping("/all")
    public List<Universite> getAll(){
      return  universiteService.retrieveAllUniversites();
    }
    @PostMapping("/addU")
    public Universite addUniv(@RequestBody Universite u ){
        return universiteService.addUniversite(u);
    }
    @GetMapping("/get/{id}")
    public Universite getById(@PathVariable("id") Integer idUniv){
        return universiteService.retrieveUniversite(idUniv);
    }
    @PutMapping("/update")
    public Universite updateUniv(@RequestBody Universite u){
        return universiteService.updateUniversite(u);
    }


}

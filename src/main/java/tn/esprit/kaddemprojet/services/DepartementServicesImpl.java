package tn.esprit.kaddemprojet.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddemprojet.entities.Departement;
import tn.esprit.kaddemprojet.entities.Etudiant;
import tn.esprit.kaddemprojet.entities.Universite;
import tn.esprit.kaddemprojet.repositories.IDepartementRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class DepartementServicesImpl implements IDepartementServices {

    @Autowired
    private final IDepartementRepository departementRepository;
    @Autowired
    private final IEtudiantServices etudiantService;
    @Autowired
    private final IUniversiteServices universiteService;

    @Override
    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId){
        Etudiant etudiant = etudiantService.retrieveEtudiant(etudiantId);
        Departement departement = retrieveDepartement(departementId);
        etudiant.setDepartement(departement);
        etudiantService.addEtudiant(etudiant);
        departementRepository.save(departement);
    }
    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement){
        Universite universite = universiteService.retrieveUniversite(idUniversite);
        Departement departement = retrieveDepartement(idDepartement);
        universite.getDepartements().add(departement);
        universiteService.addUniversite(universite);
    }
    @Override
    public List<Departement> retrieveAllDepartements() {
        return (List<Departement>) departementRepository.findAll();

    }

    @Override
    public Departement addDepartement(Departement d) {
        return departementRepository.save(d);

    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepository.save(d);

    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return departementRepository.findById(idDepart).orElse(null);

    }
}
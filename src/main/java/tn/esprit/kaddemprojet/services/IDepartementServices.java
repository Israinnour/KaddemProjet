package tn.esprit.kaddemprojet.services;

import tn.esprit.kaddemprojet.entities.Departement;

import java.util.List;

public interface IDepartementServices {

    void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;

    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);
}

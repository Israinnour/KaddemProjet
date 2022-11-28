package tn.esprit.kaddemprojet.services;

import tn.esprit.kaddemprojet.entities.Etudiant;

import java.util.List;

public interface IEtudiantServices {

    List<Etudiant> getEtudiantsByDepartement (Integer idDepart);

    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);
}

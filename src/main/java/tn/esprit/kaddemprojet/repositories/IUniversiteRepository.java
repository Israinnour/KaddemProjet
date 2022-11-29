package tn.esprit.kaddemprojet.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.kaddemprojet.entities.Departement;
import tn.esprit.kaddemprojet.entities.Etudiant;
import tn.esprit.kaddemprojet.entities.Universite;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface IUniversiteRepository extends CrudRepository<Universite,Integer> {
    @Query("select e.departements from Universite e where e.idUniv=?1")
    List<Departement> retrieveDepartementsByUniversite(Integer idUni);
}

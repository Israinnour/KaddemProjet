package tn.esprit.kaddemprojet.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.kaddemprojet.entities.Etudiant;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEtudiantRepository extends CrudRepository<Etudiant, Integer> {
    @Query("select e from Etudiant e inner join e.departement ee where ee.idDepart = ?1")
    List<Etudiant> findEtudiantsByDepartement (Integer idDepart);
}

package tn.esprit.kaddemprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.kaddemprojet.entities.Etudiant;

public interface IEtudiantRepository extends CrudRepository<Etudiant, Integer> {
}

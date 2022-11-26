package tn.esprit.kaddemprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.kaddemprojet.entities.Departement;

public interface IDepartementRepository extends CrudRepository<Departement,Integer> {
}

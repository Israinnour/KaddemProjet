package tn.esprit.kaddemprojet.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddemprojet.entities.Departement;
import tn.esprit.kaddemprojet.repositories.IDepartementRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DepartementServicesImpl implements IDepartementServices {

    @Autowired
    private final IDepartementRepository departementRepository;

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
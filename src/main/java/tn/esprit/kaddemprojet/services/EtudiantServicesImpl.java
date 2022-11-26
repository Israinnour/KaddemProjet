package tn.esprit.kaddemprojet.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddemprojet.entities.Etudiant;
import tn.esprit.kaddemprojet.repositories.IEtudiantRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EtudiantServicesImpl implements IEtudiantServices{
    @Autowired
    private final IEtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants(){
        return (List<Etudiant>) etudiantRepository.findAll();
    }
    @Override
    public Etudiant addEtudiant (Etudiant e){
        return etudiantRepository.save(e);

    }
    @Override
    public Etudiant updateEtudiant (Etudiant e){
        return etudiantRepository.save(e);

    }
    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant){
        return etudiantRepository.findById(idEtudiant).orElse(null);

    }
    @Override
    public void removeEtudiant(Integer idEtudiant){
        etudiantRepository.deleteById(idEtudiant);

    }
}
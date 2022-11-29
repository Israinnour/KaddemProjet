package tn.esprit.kaddemprojet.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddemprojet.entities.Departement;
import tn.esprit.kaddemprojet.entities.Universite;
import tn.esprit.kaddemprojet.repositories.IUniversiteRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UniversiteServicesImpl implements IUniversiteServices{
    @Autowired
    private final IUniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversites(){
        return (List<Universite>) universiteRepository.findAll();
    }
    @Override
    public Universite addUniversite (Universite u){
        return universiteRepository.save(u);
    }
    @Override
    public Universite updateUniversite (Universite u){
        return universiteRepository.save(u);
    }
    @Override
    public Universite retrieveUniversite (Integer idUniversite){
        return universiteRepository.findById(idUniversite).orElse(null);
    }
}

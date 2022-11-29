package tn.esprit.kaddemprojet.services;

import tn.esprit.kaddemprojet.entities.Universite;

import java.util.List;

public interface IUniversiteServices {

    List<Universite> retrieveAllUniversites();

    Universite addUniversite (Universite u);

    Universite updateUniversite (Universite u);

    Universite retrieveUniversite (Integer idUniversite);
}

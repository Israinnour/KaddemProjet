package tn.esprit.kaddemprojet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Getter
@Setter
@Entity
@Table( name = " Departement")
public class Departement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepart")
    private Integer idDepart;
    private String nomDepart;
    @OneToMany(mappedBy = "departement", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Set<Etudiant> Etudiants;
}

package tn.esprit.kaddemprojet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "Universite")
@Getter
@Setter
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idUniv")
    private Integer idUniv;
    private String nomUniv;
    @JsonIgnore
    @OneToMany
    private Set<Departement> departements;
}

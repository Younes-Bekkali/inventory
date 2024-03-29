package com.project.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data

@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="utilisateur")
public class Utilisateur extends AbstractEntity {

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    //private Adresse adresse;
    @Embedded
    private Adresse adresse;

    @Column(name = "datedenaissance")
    private Instant dateDeNaissance;

    @Column(name = "motdepasse")
    private String motDePasse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private  String email;

    @ManyToOne
    @JoinColumn(name="identreprise")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;


}

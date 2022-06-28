package com.project.inventory.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@Getter

public class UtilisateurDto {
    private Integer id;

    private String nom;


    private String prenom;


    private AdresseDto adresse;


    private Instant dateDeNaissance;


    private String motDePasse;


    private String photo;


    private  String email;


    private EntrepriseDto entreprise;


    private List<RolesDto> roles;

    

}

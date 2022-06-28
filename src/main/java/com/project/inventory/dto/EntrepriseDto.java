package com.project.inventory.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder

public class EntrepriseDto {

    private Integer id;
    private String nom;


    private String description;


    private AdresseDto adresse;


    private ArticleDto article;


    private String codeFiscal;


    private String photo;


    private  String email;

    private String numTel;


    private String steWeb ;


    private List<UtilisateurDto> utilisateurs;

    
}

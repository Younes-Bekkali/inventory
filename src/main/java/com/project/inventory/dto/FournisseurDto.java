package com.project.inventory.dto;


import com.project.inventory.model.Fournisseur;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class FournisseurDto {
    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;


    private String photo;


    private  String mail;


    private String numTel;


    private List<CommandeFournisseurDto> commandeFournisseurs;

        //Mapping
    //fromEntity

    public static FournisseurDto fromEntity(Fournisseur fournisseur){
        if(fournisseur == null){
            return  null;
            //Todo throw an exception
        }
        //Category --> CategoryDto
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .adresse(AdresseDto.fromEntity(fournisseur.getAdresse()))
                .photo(fournisseur.getPhoto())
                .mail(fournisseur.getMail())
                .numTel(fournisseur.getNumTel())
                .build();
    }

    //toEntity
    public static Fournisseur toEntity(FournisseurDto fournisseurDto){
        if(fournisseurDto == null){
            return  null;
        }
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setAdresse(AdresseDto.toEntity(fournisseurDto.getAdresse()));
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setNumTel(fournisseurDto.getNumTel());

        return fournisseur;

    }
    

}

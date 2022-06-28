package com.project.inventory.dto;



import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto  {
    private Integer id;
    private String code;


    private Instant dateCommande;


    private FournisseurDto fournisseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
//
//     //Mapping
//    //fromEntity
//    public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur){
//        if(commandeFournisseur == null){
//            return  null;
//            //Todo throw an exception
//        }
//        //Category --> CategoryDto
//        return CommandeFournisseurDto.builder()
//                .id(commandeFournisseur.getId())
//                .code(commandeFournisseur.getCode())
//                .dateCommande(commandeFournisseur.getDateCommande())
//                .fournisseur(commandeFournisseur.getFournisseur())
//                .build();
//    }
//
//    //toEntity
//    public static CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto){
//        if(commandeFournisseurDto == null){
//            return  null;
//        }
//        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
//        commandeFournisseur.setId(commandeFournisseurDto.getId());
//        commandeFournisseur.setCode(commandeFournisseurDto.getCode());
//        commandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
//        commandeFournisseur.setFournisseur(commandeFournisseurDto.getFournisseur());
//        return commandeFournisseur;
//    }
//



}

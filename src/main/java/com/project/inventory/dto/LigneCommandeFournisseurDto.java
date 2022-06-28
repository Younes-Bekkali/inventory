package com.project.inventory.dto;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Builder
public class LigneCommandeFournisseurDto  {
    private Integer id;

    private BigDecimal quantite;


    private BigDecimal prixUnitaire;


    private ArticleDto article;


    private CommandeFournisseurDto commandeFournisseur;


    
}

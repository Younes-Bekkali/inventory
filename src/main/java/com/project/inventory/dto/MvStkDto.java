package com.project.inventory.dto;


import com.project.inventory.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;


@Data
@Builder
public class MvStkDto {
    private Integer id;
    private TypeMvtStk typeMvt;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    
}

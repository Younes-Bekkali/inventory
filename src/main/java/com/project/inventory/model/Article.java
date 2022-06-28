package com.project.inventory.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Getter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity

@Table(name = "article")
public class Article extends AbstractEntity{

    @Column(name="identreprise")
    private Integer idEntreprise;

    @Column(name ="codearticle")
    private String codeArticle;

    @Column(name ="designation")
    private String designation;

    @Column(name="prixunitaireHt")
    private BigDecimal prixUnitaireHt;

    @Column(name="tauxtva")
    private BigDecimal tauxTva;

    @Column(name="prixunitairettc")
    private BigDecimal prixUnitaireTtc;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;

}

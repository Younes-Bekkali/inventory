package com.project.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data

@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="mvstk")
public class MvStk extends AbstractEntity {
    @Column(name="identreprise")
    private Integer idEntreprise;


    @Column(name="typemvt")
    private TypeMvtStk typeMvt;

    @Column(name="datemvt")
    private Instant dateMvt;

    @Column(name ="quantite")
    private BigDecimal quantite;


    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;
}

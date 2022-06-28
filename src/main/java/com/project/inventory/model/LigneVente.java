package com.project.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data

@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="lignevente")
public class LigneVente extends AbstractEntity {
    @Column(name="identreprise")
    private Integer idEntreprise;

    @Column(name ="quantite")
    private BigDecimal quantite;

    @Column(name="prixunitaire")
    private BigDecimal prixUnitaire;

    @ManyToOne
    @JoinColumn(name="idvente")
    private Ventes vente;


}

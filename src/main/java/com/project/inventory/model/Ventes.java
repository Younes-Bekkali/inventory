package com.project.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Data

@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="ventes")
public class Ventes extends AbstractEntity{
    @Column(name="identreprise")
    private Integer idEntreprise;

    @Column(name ="code")
    private String code;

    @Column(name = "datevente")
    private Instant dateVente;

    @Column(name = "commentaire")
    private String commentaire;
}

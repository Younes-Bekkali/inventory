package com.project.inventory.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Setter
@Getter
//@Entity
@Embeddable
//@Table(name = "adresse")
public class Adresse {


    @Column(name = "adresse1")
    private String adresse1;

    @Column(name = "adresse2")
    private String adresse2;

    @Column(name = "ville")
    private String ville;

    @Column(name = "codePostal")
    private String codePostal;

    @Column(name = "pays")
    private String pays;
}

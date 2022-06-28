package com.project.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "client")
public class Client extends AbstractEntity{
    @Column(name="identreprise")
    private Integer idEntreprise;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    //private Adresse adresse;
    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "mail")
    private  String mail;

    @Column (name = "numTel")
    private String numTel;

    // Client a plusieurs CommandeClient
    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;



}

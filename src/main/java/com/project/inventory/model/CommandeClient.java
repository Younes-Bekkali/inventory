package com.project.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "commandeclient")
@EqualsAndHashCode(callSuper = true)
public class CommandeClient extends AbstractEntity{
    @Column(name="identreprise")
    private Integer idEntreprise;
    
    @Column (name = "code")
    private String code;

    @Column(name = "datecommande")
    private Instant dateCommande;



    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    public List<LigneCommandeClient> ligneCommandeCliens;

}

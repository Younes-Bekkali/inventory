package com.project.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data

@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="roles")
public class Roles extends AbstractEntity {
    @Column(name="identreprise")
    private Integer idEntreprise;

    @Column(name="roleame")
    private String roleName;

    @ManyToOne
    @JoinColumn(name="idutilisateur")
    private Utilisateur utilisateur;
}

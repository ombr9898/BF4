package com.example.bf4.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BandeCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Setter(AccessLevel.NONE)
    @OneToMany
    private List <CoupleProduitQuantitéPrixU> produits = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "fornisseur_id")
    private Fornisseur fornisseur;
    private Date date;
    private String lieu;
    private String conditionDeLivraison;




}

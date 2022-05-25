package tn.iteam.produitsmvc.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.CORBA.portable.IDLEntity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUITS")
@Data @NoArgsConstructor @AllArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REF")
    private Long reference;
    @Column(name = "DES")
    private String designation;
    private double prix;
    private int quantite;

}

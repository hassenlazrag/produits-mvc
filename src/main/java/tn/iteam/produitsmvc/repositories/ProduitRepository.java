package tn.iteam.produitsmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.iteam.produitsmvc.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}

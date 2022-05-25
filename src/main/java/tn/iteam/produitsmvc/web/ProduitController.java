package tn.iteam.produitsmvc.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tn.iteam.produitsmvc.entities.Produit;
import tn.iteam.produitsmvc.repositories.ProduitRepository;

import java.util.List;

@Controller
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping(path = "/index")
    public String patients(Model model) {
        List<Produit> produits = produitRepository.findAll();
        model.addAttribute("listProduits", produits);
        return "produits";
    }

}

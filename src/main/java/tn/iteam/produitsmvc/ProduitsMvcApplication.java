package tn.iteam.produitsmvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.iteam.produitsmvc.entities.Produit;
import tn.iteam.produitsmvc.repositories.ProduitRepository;

@SpringBootApplication
public class ProduitsMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProduitsMvcApplication.class, args);
    }
    @Bean
    CommandLineRunner begin(ProduitRepository produitRepository){
        return args -> {
            produitRepository.save(new Produit(null, "HP Computer", 4500, 12));
            produitRepository.save(new Produit(null, "DEL Computer", 6700, 8));
            produitRepository.save(new Produit(null, "Printer Lazer", 1500, 25));
            produitRepository.save(new Produit(null, "Printer HP 200", 1200, 14));
            produitRepository.save(new Produit(null, "LapTop Lenevo", 5600, 7));

            produitRepository.findAll().forEach(
                    p-> System.out.println(p.getDesignation())
            );
        };
    }

}

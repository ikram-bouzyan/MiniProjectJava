package pk;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Livre[] livresEtRomans = new Livre[]{
                new Livre("Livre1", "Auteur1", 30.0, 300),
                new Livre("Livre2", "Auteur2", 25.0, 250),
                new Roman("Roman1", "Auteur3", 40.0, 400, "Edition1", 150),
                new Roman("Roman2", "Auteur4", 35.0, 350, "Edition2", 120)
        };

        
        System.out.println("Affichage initial :");
        for (Livre livre : livresEtRomans) {
            livre.afficher();
            System.out.println();
        }

        
        System.out.println("\nAffichage après le tri par prix :");
        Arrays.sort(livresEtRomans);
        for (Livre livre : livresEtRomans) {
            livre.afficher();
            System.out.println();
        }

       
        Livre nouveauLivre = new Livre("NouveauLivre", "Auteur5", 50.0, 500);
        Livre[] nouveauTableauLivres = Arrays.copyOf(livresEtRomans, livresEtRomans.length + 1);
        nouveauTableauLivres[nouveauTableauLivres.length - 1] = nouveauLivre;

        
        Livre[] tableauSansPremierLivre = Arrays.copyOfRange(livresEtRomans, 1, livresEtRomans.length);

        
        Livre[] copieTableauLivres = Arrays.copyOf(livresEtRomans, livresEtRomans.length);

        
        Collections.reverse(Arrays.asList(livresEtRomans));

        
        System.out.println("\nAffichage après les modifications :");
        for (Livre livre : livresEtRomans) {
            livre.afficher();
            System.out.println();
        }
    }

	}




package pk;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
public class Livre implements Comparable<Livre>, Cloneable {
	
	private String titre; 
	private String auteur;
	private double prix; 
	private int nb_page;
	
	private static int nombreTotalLivres = 0;
	private static double prixMax = Double.MIN_VALUE;
    private static double prixMin = Double.MAX_VALUE;
	
	public Livre(String titre,String auteur,double prix,int nb_page) {
		this.titre=titre;
		this.auteur=auteur;
		this.prix=prix;
		this.nb_page=nb_page;
		
		nombreTotalLivres++;
		prixMax = Math.max(prixMax, prix);
	    prixMin = Math.min(prixMin, prix);
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getNb_page() {
		return nb_page;
	}
	public void setNb_page(int nb_page) {
		this.nb_page = nb_page;
	} 
	
	
	public static int getNombreTotalLivres() {
	        return nombreTotalLivres;
	}

	    
    public static double getPrixMax() {
        return prixMax;
    }

	    
    public static double getPrixMin() {
        return prixMin;
    }

	    
    @Override
    public int compareTo(Livre autreLivre) {
        return Double.compare(this.prix, autreLivre.prix);
    }

	    
    @Override
    public Livre clone() {
        try {
            return (Livre) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); 
        }
    }

	   
    @Override
    public String toString() {
        return "Livre [titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + ", nombrePages=" + nb_page + "]";
    }

	    
    public void afficher() {
        System.out.println("Type: Livre");
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Prix: " + prix);
        System.out.println("Nombre de pages: " + nb_page);
    }
	
}

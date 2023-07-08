package Bibliotheque;
import java.util.ArrayList;

public class Bibliotheque {
    String nom;
    double liste_exemplaire;
    int Nb_exemplaire;

    public int getNb_exemplaire() {
        return Nb_exemplaire;
    }

    public void setNb_exemplaire(int nb_exemplaire) {
        Nb_exemplaire = nb_exemplaire;
    }

    public double getListe_exemplaire() {
        return liste_exemplaire;
    }

    public void setListe_exemplaire(double liste_exemplaire) {
        this.liste_exemplaire = liste_exemplaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public Bibliotheque(String nom){
        this.nom=nom;
    }
    public void stocker(String oeuvres, int n) {
        ArrayList<String> liste_exemplaire = new ArrayList<>();
        for (int i=0; i < n;i++);
        liste_exemplaire.add(String.valueOf(oeuvres));
    }
    public void lister(String oeuvres ){
        stocker(String.valueOf(oeuvres),1);
    }
    public void afficher(){
        System.out.println("La bibliotheque municipale est ouverte !");
    }
}
//    public void compter(){
//        for (int i=0, i<liste_exemplaire.lenght();i++)
//    }

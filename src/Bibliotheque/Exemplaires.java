package Bibliotheque;

public class Exemplaires extends Bibliotheque{
    String reference;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Exemplaires(String reference, String nom){
        super(nom);
    }
    public void afficher(String titre, String nom, String langue) {
//        if (Auteur = est_prix) {
            System.out.println("un exemplaire de " + titre + " et le nom de l'auteur est : " + nom + ", et en " + langue);
        }
    }

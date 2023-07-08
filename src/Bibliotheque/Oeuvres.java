package Bibliotheque;

public class Oeuvres extends Bibliotheque {
    String titre;
    static String reference;
    String langue;

    public Oeuvres(String nom,String titre,String reference,String langue) {
        super(nom);
        this.setTitre(titre);
        this.setLangue(langue);
        this.setReference(reference);
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public static final String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }
    public void afficher(String titre, String nom, String langue) {
        System.out.println("le titre est : "+titre+" et le nom de l'auteur est : "+nom+" , et en "+langue);
    }
}

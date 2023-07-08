package Bibliotheque;

public class Auteur extends Bibliotheque{
    boolean est_prix;

    public Auteur(String nom, String est_prix){
        super(nom);
        this.setEst_prime(Boolean.parseBoolean(est_prix));
    }

    public boolean isEst_prix() {
        return est_prix;
    }

    public void setEst_prime(boolean est_prime) {
        this.est_prix = est_prix;
    }

}

package ParcAuto;

public class Voiture extends Vehicule {
    private int vitesse;

    public Voiture(int vitesse,String matricule,int ANNEMODELE,int price) {
        super(matricule,ANNEMODELE,price);
        this.setVitesse(vitesse);
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse)
        throws IllegalArgumentException {
            if (vitesse > 60) {
                throw new IllegalArgumentException("attention vous avez dépassé la vitesse autorisée");
            }
            this.vitesse = vitesse;
    }
    public void demarrer() {
        if (vitesse == 0) {
            System.out.println("merci de demarrer votre voiture");
        }
    }
    public void accelerer(){
        if(vitesse != 0 && vitesse < 40) {
            System.out.println("vous pouvez accelerer");
        }
    }

    public String toString() {
        return String.format("matricule : %s\nvitesse : %s",this.getMatricule(),this.getANNEEMODELE(),this.getPrice(),this.vitesse);
    }
}

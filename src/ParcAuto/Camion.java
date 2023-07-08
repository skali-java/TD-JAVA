package ParcAuto;

public class Camion extends Vehicule {
    private int vitesse;

    public Camion(int vitesse, String matricule, int ANNEMODELE, int price) {
        super(matricule, ANNEMODELE, price);
        this.setvitesse(vitesse);

    }

    public int getvitesse() {
        return vitesse;
    }

    public void setvitesse(int vitesse) throws IllegalArgumentException {
        if (vitesse > 40) {
            throw new IllegalArgumentException("attention vous avez dépassé la vitesse autorisée");
        }
        this.vitesse = vitesse;
    }

    public void demarrer() {
        if (vitesse == 0) {
            System.out.println("merci de demarrer votre camion");
        }
    }

    public void accelerer() {
        if (vitesse != 0 && vitesse < 30) {
                System.out.println("merci d'accelerer");
            }
        }
        public String toString () {
            return String.format("matricule : %s\nvitesse-camion : %s", this.getMatricule(), this.getANNEEMODELE(), this.getPrice(), this.vitesse);
        }
    }
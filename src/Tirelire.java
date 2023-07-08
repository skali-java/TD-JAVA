import java.util.Scanner;

public class Tirelire {
    private double montant;

    public Tirelire(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

        public void afficher(){
            if (montant > 0) {
                System.out.printf("Vous avez %s dans votre tirelire.", montant);
            } else {
                System.out.println("Vous êtes sans le sou");
            }
        }

        public void secouer(){
            if (montant > 0) {
                System.out.println(" Bing bing");
            }
        }

        public void remplir(double montantARemplir){
            if (montantARemplir > 0) {
                montant += montantARemplir;
            }
        }

        public void vider(){
            montant = 0;
        }

        public void puiser(double montantPuiser){
            if (montantPuiser >= montant) {
                this.vider();
            }
            else if (montantPuiser > 0 && montantPuiser < montant)
            {
                montant -= montantPuiser;
                }
            }

        public double calculerSolde () {
            Scanner input = new Scanner(System.in);
            System.out.print("merci d'entrer votre budget :");
            double budget = input.nextDouble();
            if (budget <= 0) {
                System.out.printf("votre budget est nul", montant);
                return montant;
            } else if (budget > montant) {
                System.out.printf("il vous manque %s", (montant - budget));
                return montant - budget;
            } else {
                System.out.println();
                return montant - budget;
            }
        }
    }
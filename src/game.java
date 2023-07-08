import java.util.Scanner;

public class game {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Bienvenue dans Pierre, Papier, Ciseaux !");
                System.out.println("Choisissez votre coup :");
                System.out.println("1. Pierre");
                System.out.println("2. Papier");
                System.out.println("3. Ciseaux");

                int coupJoueur = scanner.nextInt();
                int coupOrdinateur = (int) (Math.random() * 3) + 1;

                String nomCoupJoueur = getCoupNom(coupJoueur);
                String nomCoupOrdinateur = getCoupNom(coupOrdinateur);

                System.out.println("Vous avez choisi : " + nomCoupJoueur);
                System.out.println("L'ordinateur a choisi : " + nomCoupOrdinateur);

                String resultat = determinerResultat(coupJoueur, coupOrdinateur);
                System.out.println(resultat);
            }

            public static String getCoupNom(int coup) {
                switch (coup) {
                    case 1:
                        return "Pierre";
                    case 2:
                        return "Papier";
                    case 3:
                        return "Ciseaux";
                    default:
                        return "";
                }
            }

            public static String determinerResultat(int coupJoueur, int coupOrdinateur) {
                if (coupJoueur == coupOrdinateur) {
                    return "Égalité !";
                } else if ((coupJoueur == 1 && coupOrdinateur == 3) ||
                        (coupJoueur == 2 && coupOrdinateur == 1) ||
                        (coupJoueur == 3 && coupOrdinateur == 2)) {
                    return "Vous avez gagné !";
                } else {
                    return "L'ordinateur a gagné !";
                }
            }
        }

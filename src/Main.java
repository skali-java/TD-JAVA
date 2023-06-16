// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

     import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                // Création d'un objet Scanner pour la saisie utilisateur
                Scanner scanner = new Scanner(System.in);

                System.out.print("Veuillez saisir le diamètre du cercle : ");
                double diametre = scanner.nextDouble();

                // Calcul de la surface du cercle
                double rayon = diametre / 2;
                double surface = Math.PI * Math.pow(rayon, 2);

                System.out.println("La surface du cercle est : " + surface);

            }
        }

import java.util.Scanner;
public class tab2 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Demande à l'utilisateur de spécifier les tailles des tableaux
                System.out.print("Taille du premier tableau : ");
                int taille1 = scanner.nextInt();
                System.out.print("Taille du deuxième tableau : ");
                int taille2 = scanner.nextInt();
                System.out.print("Taille du troisième tableau : ");
                int taille3 = scanner.nextInt();

                // Déclaration des tableaux en utilisant les tailles spécifiées par l'utilisateur
                int[] tableau1 = new int[taille1];
                int[] tableau2 = new int[taille2];
                int[] tableau3 = new int[taille3];

                // Remplissage du premier tableau
                System.out.println("Remplissage du premier tableau :");
                for (int i = 0; i < tableau1.length; i++) {
                        System.out.print("Entrez un entier : ");
                        tableau1[i] = scanner.nextInt();
                }

                // Remplissage du deuxième tableau
                System.out.println("Remplissage du deuxième tableau :");
                for (int i = 0; i < tableau2.length; i++) {
                        System.out.print("Entrez un entier : ");
                        tableau2[i] = scanner.nextInt();
                }

                // Remplissage du troisième tableau
                System.out.println("Remplissage du troisième tableau :");
                for (int i = 0; i < tableau3.length; i++) {
                        System.out.print("Entrez un entier : ");
                        tableau3[i] = scanner.nextInt();
                }

                // Affichage des tableaux
                System.out.println("Contenu des tableaux :");
                System.out.print("Tableau 1 : ");
                afficherTableau(tableau1);
                System.out.print("Tableau 2 : ");
                afficherTableau(tableau2);
                System.out.print("Tableau 3 : ");
                afficherTableau(tableau3);
        }

        // Méthode pour afficher le contenu d'un tableau
        public static void afficherTableau(int[] tableau) {
                for (int i = 0; i < tableau.length; i++) {
                        System.out.print(tableau[i] + " ");
                }
                System.out.println();
        }
}
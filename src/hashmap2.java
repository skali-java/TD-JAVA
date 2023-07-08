import java.util.Scanner;

public class hashmap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez la taille du tableau : ");
    int taille = scanner.nextInt();

    int[] tableau = new int[taille];

        System.out.println("Remplissez le tableau :");
        for (int i = 0; i < taille; i++) {
        System.out.print("Entrez l'élément à l'index " + i + " : ");
        tableau[i] = scanner.nextInt();
    }

        System.out.print("Entrez le nombre à rechercher : ");
    int nombreRecherche = scanner.nextInt();

    boolean trouve = false;
        for (int i = 0; i < taille; i++) {
        if (tableau[i] == nombreRecherche) {
            trouve = true;
            break;
        }
    }

        if (trouve) {
        System.out.println("Le nombre " + nombreRecherche + " est présent dans le tableau.");
    } else {
        System.out.println("Le nombre " + nombreRecherche + " n'est pas présent dans le tableau.");
    }
}
}

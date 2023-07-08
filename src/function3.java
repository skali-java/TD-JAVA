import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class function3 {
    public static void main(String[] args) {
        List<String> langages = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de langages de programmation souhaitez-vous ajouter ? ");
        int nombreLangages = scanner.nextInt();
        scanner.nextLine(); // Consommer le retour à la ligne après la saisie du nombre

        for (int i = 0; i < nombreLangages; i++) {
            System.out.print("Langage #" + (i + 1) + ": ");
            String langage = scanner.nextLine();
            langages.add(langage);
        }
        System.out.println("Liste des langages avant la suppression :");
        afficherLangages(langages);

        System.out.print("Combien de langages souhaitez-vous retirer de la liste ? ");
        int nombreLangagesASupprimer = scanner.nextInt();
        scanner.nextLine(); // Consommer le retour à la ligne après la saisie du nombre

        for (int i = 0; i < nombreLangagesASupprimer; i++) {
            System.out.print("Nom du langage à supprimer #" + (i + 1) + ": ");
            String langageASupprimer = scanner.nextLine();
            langages.remove(langageASupprimer);
        }
        System.out.println("Liste des langages après la suppression :");
        afficherLangages(langages);
    }
//    methode
    private static void afficherLangages(List<String> langages) {
        for (String langage : langages) {
            System.out.println(langage);
        }
        System.out.println();
    }
}
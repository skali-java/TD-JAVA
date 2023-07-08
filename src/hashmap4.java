import java.util.Scanner;

public class hashmap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un texte : ");
        String texte = scanner.nextLine(); // Lire la saisie de l'utilisateur

        // Inversion de la chaîne de caractères
        String texteInverse = "";
        for (int i = texte.length() - 1; i >= 0; i--) {
//            texteInverse += texte.charAt(i);
            texteInverse = texteInverse+texte.charAt(i);
        }
        // Affichage de la chaîne inversée
        System.out.println("Chaîne inversée : " + texteInverse);
        // Fermeture du scanner
    }
}

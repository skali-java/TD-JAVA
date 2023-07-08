import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class hashmap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un texte : ");
        String texte = scanner.nextLine();
        Map<Character, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < texte.length(); i++) {
            char lettre = texte.charAt(i);
            // Vérifier si la lettre est une lettre de l'alphabet
            if (Character.isLetter(lettre)) {
                // Convertir la lettre en minuscule pour ignorer la casse
                lettre = Character.toLowerCase(lettre);
                // Mettre à jour le nombre d'occurrences de la lettre dans la map
                occurrences.put(lettre, occurrences.getOrDefault(lettre, 0) + 1);
            }
        }
        System.out.println("Occurrences des lettres :");
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            char lettre = entry.getKey();
            int nbOccurrences = entry.getValue();
            System.out.println(lettre + " : " + nbOccurrences);
        }
    }
}

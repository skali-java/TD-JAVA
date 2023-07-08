import java.util.Scanner;

import java.util.HashMap;

public class hashmap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        La méthode length() renvoie le nombre de caractères présents dans une chaîne de caractères.
{
            int[] tab1 = {5, 3, 5, 6, 7, 1, 6, 2, 1, 7, 6};
            int taille = tab1.length;
            for (int i = 0; i < taille; i++) {
                int count = 0;
                for (int j = 0; j < taille; j++) {
                    if (tab1[i] == tab1[j])
                        count++;
                }
                System.out.println("Le nombre le plus frequent dans le tableau est le :" + tab1[i] + " " + count + " fois");
            }
        }
    }
}
import java.util.Scanner;
import java.util.Arrays;
public class testopt {
    public static void main(String[] args) {

        int[][] tab = {{1, 4, 2, 1},{6, 3, 8, 9},{1, 5, 1, 0}};
//        Scanner scanner = new Scanner(System.in);
        {
            int taille = tab.length;

            for (int i = 0; i < taille; i++) {
                int count = 0;
                for (int j = 0; j < taille; j++) {
                    if (tab[i] == tab[j]);
                    count++;
                }
                System.out.println("Le nombre le plus frequent dans le tableau est le :" + tab[i] + " " + count + " fois");

            }
        }
    }
}
/**
 *
 */
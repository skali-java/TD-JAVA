import java.util.Arrays;
import java.util.Scanner;
public class tp1Optimisation {
    public static void main(String[] args) {

        int[] tab1 = {1, 4, 2, 1};
        int[] tab2 = {6, 3, 8, 9};
        int[] tab3 = {1, 5, 1, 0};
        Scanner scanner = new Scanner(System.in);
        {
            int taille = tab1.length;

            for (int i = 0; i < taille; i++) {
                int count = 0;
                for (int j = 0; j < taille; j++) {
                    if (tab1[i] == tab1[j]);
                        count++;
                }
                System.out.println("Le nombre le plus frequent dans le tableau1 est le :" + tab1[i] + " " + count + " fois");
            }
        }
    }
}

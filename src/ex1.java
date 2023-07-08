import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le nombre dont souhaitez afficher la table de multiplication : ");
        int nombre = input.nextInt();
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        for (int i = x1; i <= y1; i++) {
            int produit = nombre * i;
            System.out.printf("%d x %d = %d\n", nombre, i, produit);
        }
    }
}

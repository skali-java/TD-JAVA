package calculatrice;
import java.util.Scanner;

public class calculatrice {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int nbr1, nbr2;
                System.out.print("entre nbr1 :");
                nbr1 = scanner.nextInt();
                System.out.print("entre nbr2 :");
                nbr2 = scanner.nextInt();
                System.out.print("la somme est :"+(nbr1+nbr2));


        }
}

import java.util.Scanner;
public class tp3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Votre variable : ");
        Integer variable = input.nextInt();

        {
            if (variable > 0) {
                System.out.println("La variable est positive");

            }
            if (variable < 0) {
                System.out.println("La variable est négative");

            }
            if (variable == 0) {
                System.out.println("La variable est pair");

            }
        }
    }
}
import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Devinez le nombre entre 1 et 100 !");

        while (true) {
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Trop bas !");
            } else if (guess > randomNumber) {
                System.out.println("Trop haut !");
            } else {
                System.out.println("Correct ! Vous avez deviné le nombre en " + attempts + " essais.");
                break;
            }
        }

        scanner.close();
    }
}

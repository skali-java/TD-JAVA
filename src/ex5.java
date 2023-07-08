import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Donnez un entier pour vérifier s'il est parfait ou pas : ");
        int nombreAVerifier = input.nextInt();
        int sommeDiviseurs = 0;

        for (int i = 1; i <= nombreAVerifier / 2; i++) {
            if (nombreAVerifier % i == 0) {
                sommeDiviseurs += i;
            }
        }
        if (sommeDiviseurs == nombreAVerifier) {
            System.out.printf("La somme des diviseurs de %d est %d. Le nombre donc est parfait.%n", nombreAVerifier, sommeDiviseurs);
        }
        else
        {
            System.out.printf("La somme des diviseurs de %d est %d. Le nombre donc n'est pas parfait.%n", nombreAVerifier, sommeDiviseurs);
        }
    }
}
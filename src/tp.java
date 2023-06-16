import java.util.Scanner;

public class tp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Votre nom: ");
        String nom = input.nextLine();

        System.out.println("Votre age : ");
        int age = input.nextInt();

        System.out.printf("Votre nom est %s, et vous avez %d ans.", nom, age);
    }
}

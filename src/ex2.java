import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre entier positif : ");
        int number = input.nextInt();
        int factorial = calculateFactorial(number);
        System.out.println("Le factoriel de " + number + " est : " + factorial);
    }

    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}

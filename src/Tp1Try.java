import java.util.InputMismatchException;
import java.util.Scanner;
public class Tp1Try {
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Vous ne devez pas diviser un nombre par 0");
        }
        return a / b;
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        try {
            System.out.print("Premier nombre : ");
            double nombre1 = input.nextDouble();

            System.out.print("Deuxieme nombre : ");
            double nombre2 = input.nextDouble();

            double rapport = divide(nombre1, nombre2);
            System.out.println("Rapport : " + rapport);
        } catch (InputMismatchException e) {
            System.out.println("Erreur => " + e);
        } catch (ArithmeticException e) {
            System.out.println("Erreur => " + e.getMessage());
        }
    }
}
import java.util.*;
public class tp5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrez les coefficients de l'équation du 2nd degré (ax^2 + bx + c = 0) :");

            System.out.print("a : ");
            double a = scanner.nextDouble();

            System.out.print("b : ");
            double b = scanner.nextDouble();

            System.out.print("c : ");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Deux racines réelles :");
                System.out.println("x1 = " + racine1);
                System.out.println("x2 = " + racine2);
            } else if (discriminant == 0) {
                double racine = -b / (2 * a);
                System.out.println("Une racine réelle :");
                System.out.println("x = " + racine);
            } else {
                System.out.println("Pas de racines réelles.");
            }
        }
    }
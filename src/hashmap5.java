import java.util.Scanner;
public class hashmap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        int inverse = inverserNombre(nombre);
        System.out.println("Le nombre inverse est : " + inverse);
    }
    public static int inverserNombre(int nombre) {
        int inverse = 0;
        while (nombre != 0) {
            int reste = nombre % 10;
            inverse = inverse * 10 + reste;
            nombre = nombre / 10;
        }
         return inverse;
    }
}

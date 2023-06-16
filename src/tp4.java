import java.util.Scanner;

public class tp4 {

    public static class tp {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Votre age : ");
            int age = input.nextInt();
            int date = 2023 - age;

            System.out.printf("Votre date est %d", date);
        }
    }
}

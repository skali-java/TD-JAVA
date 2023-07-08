import java.util.Scanner;

public class bool {
    public static class tp {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Votre langue : ");
            String langue = input.nextLine();
            langue = langue.toLowerCase();// ENGLISH -> english

            switch (langue) {
                case "english" -> System.out.println("Hello!!");
                case "french" -> System.out.println("Salut!!");
                case "spanish" -> System.out.println("Holla!!");
                case "german" -> System.out.println("Guten tag");
                default -> System.out.println("Langue non supportee");
            }
        }
    }
}
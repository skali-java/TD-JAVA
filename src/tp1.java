import java.util.Scanner;
public class tp1 {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Votre langue : ");
            String langue=input.nextLine();
            langue=langue.toLowerCase();// ENGLISH -> english

            if(langue.equalsIgnoreCase("english")){
                System.out.println("Hello!!");
            }else if(langue.equalsIgnoreCase("french")){
                System.out.println("Salut!!");
            } else if (langue.equalsIgnoreCase("spanish")) {
                System.out.println("Holla!!");
            } else if (langue.equalsIgnoreCase("german")) {
                System.out.println("Guten tag");
            }else {
                System.out.println("Langue non supportee");
            }
        }
}

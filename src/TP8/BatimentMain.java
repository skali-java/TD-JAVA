package TP8;
public class BatimentMain {
    public static void main(String[] args) {
        try {

            var maison = new Maison("rue de paris", 4);
            System.out.println(maison);
        }

        catch (IllegalArgumentException e) {
            System.err.println("Erreur => " + e.getMessage());
        }
    }
}
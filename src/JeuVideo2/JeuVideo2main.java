package JeuVideo2;

import JeuVideo2.Guerrier;

public class JeuVideo2main {
    public static void main(String[] args) {

        try {
            var guerrier = new Guerrier("Hercules", "AK-47");
            System.out.println(guerrier);
            guerrier.rencontrer();


            var magicien = new Magicien("Harry Poter", "Magic magic");
            System.out.println(magicien);
            magicien.rencontrer();

        } catch (IllegalArgumentException e) {
            System.err.println("Erreur => " + e.getMessage());
        }
    }
}
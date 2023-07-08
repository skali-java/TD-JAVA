package Bibliotheque;

import ParcAuto.Camion;
import ParcAuto.Voiture;

public class BiblioMain {
    public static void main(String[] args) {
        try{
            var Auteur = new Auteur("victor hugo","est_prix");
            System.out.println(Auteur);
            Auteur.stocker("Antigon",1);
            Auteur.lister("Antigon");

            var Oeuvres = new Oeuvres("victor hugo","Les Miserables","L2017","francais");
            System.out.println(Oeuvres);
            Oeuvres.stocker("Titanic",2);
            Oeuvres.lister("Titanic");
            Oeuvres.afficher("Antigon","victor hugo","francais");

            var Exemplaires = new Exemplaires("L2017","victor hugo");
            System.out.println(Exemplaires);
            Exemplaires.stocker("antigon",2);
            Exemplaires.lister("antigon");
            Exemplaires.afficher("Les Miserables","victor hugo","francais");

        }
        catch (IllegalArgumentException e) {
            System.err.println("Urgent => " + e.getMessage());
        }
    }
    }

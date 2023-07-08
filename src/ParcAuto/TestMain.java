package ParcAuto;
public class TestMain {
    public static void main(String[] args) {
        try {
            var Voiture = new Voiture(55,"a85",1999,75000);
            System.out.println(Voiture);
            Voiture.demarrer();
            Voiture.accelerer();


            var Camion = new Camion(25,"a45", 2004, 78000);
            System.out.println(Camion);
            Camion.demarrer();
            Camion.accelerer();
        }
        catch (IllegalArgumentException e) {
            System.err.println("Urgent => " + e.getMessage());
        }
    }
}

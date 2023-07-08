package ParcAuto;

public class Vehicule {
    private static String matricule;
    private int ANNEEMODELE;
    private int price;

    public Vehicule(String matricule,int ANNEEMODELE, int price) {
        this.matricule=matricule;
        this.ANNEEMODELE=ANNEEMODELE;
        this.price=price;

    }

    public static String getMatricule() {
        return matricule;
    }

    public static void setMatricule(String matricule) {
        Vehicule.matricule = matricule;
    }

    public int getANNEEMODELE() {
        return ANNEEMODELE;
    }

    public void setANNEEMODELE(int ANNEEMODELE) {
        this.ANNEEMODELE = ANNEEMODELE;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public void demarrer() {
////        System.out.println("Bonjour, vous pouvez demarrer votre vehicule");
//    }

//    public void accelerer() {
////        System.out.println("Bonjour, vous pouvez accélérer et s'amuser de la vie");
//    }
}
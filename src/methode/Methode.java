package methode;

import java.util.Scanner;

public class Methode {
    static double n1,n2; // pour éviter de redeclarer à chaque fois ces variables
    static double moy;
    public static void main(String[] args) {
        lire();
        division(n1,n2);
        lire();
        moyenne(n1,n2);
    }

    public static void division(double n1,double n2) {
        double div = n1 / n2;
        System.out.println("la division de " + n1 + " sur " + n2 + " est egale" + div);
    }
    public static double moyenne(double n1,double n2) {
        moy = (n1+n2)/2;
        System.out.println("la moyenne de " + n1 + " et " + n2 + " est " + moy);
        return moy;
    }

    public static void lire() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("entrer les 2 numeros :");
        n1 = clavier.nextInt();
        n2 = clavier.nextInt();
    }
}

public class function {
    public static void main(String[] args) {
        double longueur = 500;
        double largeur = 250;
        afficherRectangle(longueur, largeur);
    }

    // longueur et largeur sont des parametres
    static double calculPerimetre(double longueur, double largeur) {
//        double perimetre=2*(longueur+largeur);
//        return perimetre;
        return 2 * (longueur + largeur);
    }

    static double calculSurface(double longueur, double largeur) {
        return longueur * largeur;
    }

    static void afficherRectangle(double longueur, double largeur) {
        double perimetre = calculPerimetre(longueur, largeur);//longueur et largeur sont des arguments
        double surface = calculSurface(longueur, longueur);
        System.out.println("Perimetre : " + perimetre);
        System.out.println("Surface : " + surface);
    }
}
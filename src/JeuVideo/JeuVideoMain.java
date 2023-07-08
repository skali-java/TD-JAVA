package JeuVideo;

public class JeuVideoMain {
    public static void main(String[] args) {

        try {
            var guerrier = new Guerrier();
            guerrier.setNom("Hercules");
            guerrier.setArme("AK-47");
            guerrier.setDureeDeVie(100);

            System.out.println("Nom : " + guerrier.getNom());
            System.out.println("Arme : " + guerrier.getArme());
            System.out.println("Duree de vie : " + guerrier.getDureeDeVie());
            System.out.println("Duree de vie par defaut 1: " + Guerrier.DUREE_DE_VIE_PAR_DEFAUT);
            System.out.println("Nombre des guerriers : " + Guerrier.getNombreGuerriers());

            var guerrier2 = new Guerrier();
            guerrier2.setNom("Hulk");
            guerrier2.setArme("M16");
            guerrier2.setDureeDeVie(200);
            System.out.println("Nom : " + guerrier2.getNom());
            System.out.println("Arme : " + guerrier2.getArme());
            System.out.println("Duree de vie : " + guerrier2.getDureeDeVie());
            System.out.println("Duree de vie par defaut 2: " + Guerrier.DUREE_DE_VIE_PAR_DEFAUT);
            System.out.println("Nombre des guerriers : " + Guerrier.getNombreGuerriers());

            var g = new Guerrier();
            System.out.println("Nombre guerriers : " + Guerrier.getNombreGuerriers());

        } catch (IllegalArgumentException e) {
            System.err.println("Erreur => " + e.getMessage());
        }
    }
}
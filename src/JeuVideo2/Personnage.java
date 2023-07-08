package JeuVideo2;

public class Personnage {
    private String nom;
    private int dureeDeVie;

    public static final int DUREE_DE_VIE_PAR_DEFAUT=300;

    private static int nombrePersonnages=0;

//    Personnage(String nom){
//        setNom(nom);
//        this.dureeDeVie=DUREE_DE_VIE_PAR_DEFAUT;
//        nombrePersonnages++;
//    }
//
//    public String getNom() {
//        return nom;
//    }
        public String getNom() {
        return nom;
    }
        Personnage(String nom){
        setNom(nom);
        this.dureeDeVie=DUREE_DE_VIE_PAR_DEFAUT;
        nombrePersonnages++;
    }


    public void setNom(String nom)throws IllegalArgumentException {
        if(nom.isEmpty() || nom.matches(".*\\d.*")){
            throw new IllegalArgumentException("Le nom ne peut pas etre vide ou contenu des chiffres");
        }
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) throws IllegalArgumentException {
        if(dureeDeVie<=0){
            throw new IllegalArgumentException("La duree doit toujours etre positive");
        }
        this.dureeDeVie = dureeDeVie;
    }

    public static int getNombrePersonnages(){
        return nombrePersonnages;
    }

    public void rencontrer(){
        System.out.println("Bonjour");
    }
}
public class MainEleve {
    //    public static void main(String[] args) {
//        Eleve eleve1= new Eleve();
////        Eleve eleve1= new Eleve("amien",25,8);
//        System.out.println(eleve1.nom);
//        System.out.println(eleve1.age);
//        System.out.println(eleve1.niveau);
//    }
    public static void main(String[] args) {
        Eleve eleve1 = new Eleve("amien", 25, 8);
        System.out.println(eleve1.nom);
        System.out.println(eleve1.age);
        System.out.println(eleve1.niveau);

        Eleve eleve2 = new Eleve("tiza");
        System.out.println(eleve2.nom);
    }
}
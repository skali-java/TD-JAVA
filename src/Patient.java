//public class Patient {
//    private String patient;
//    private static double taille;
//    private static int poids;
//    private static double IMC;
//
//    public Patient(String patient, double taille, double poids) {
//        // Shadowing
//        this.patient = patient;
//        this.taille = taille;
//        this.poids = poids;
//        CalculateIMC();
//    }
//
//    private void CalculateIMC() {
//        IMC = (this.poids / this.taille * this.taille);
//    }
//
//    public String data() {
//        return String.format("le patient est %s %s %s", poids, taille, IMC);
//
//    }
//}
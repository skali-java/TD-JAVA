public class MainTirelire {
    public static void main(String[] args) {
        Tirelire Tirelire = new Tirelire(200);
        Tirelire.puiser(300);
        System.out.println("votre montant "+ Tirelire.getMontant());
        Tirelire.afficher();
        Tirelire.secouer();
        Tirelire.calculerSolde();

    }
}

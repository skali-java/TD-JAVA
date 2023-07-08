public class MainPlayer {
    public static void main(String[] args) {
        Player player1 = new Player("amine",22.0, 80.0);
        System.out.println("le joueur est : " +player1.getName());
        System.out.println("son attaque est : " +player1.getAttack());
        player1.damage(50);
        Player player2 = new Player("hamza",27.0, 40.0);
        player2.damage(14);
        System.out.println("le poids actuel est : " +player1.getPoids());
    }
}

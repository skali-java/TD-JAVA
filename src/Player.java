public class Player {
    private String name;
    private double attack;
    private double poids;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void damage(double damage){
        this.poids -= damage;
        System.out.println(name + " a perdu " + damage);
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public Player(String name, double attack, double poids){
        this.name =name;
        this.attack =attack;
        this.poids =poids;

    }
}

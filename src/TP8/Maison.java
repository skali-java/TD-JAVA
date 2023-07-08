package TP8;

public class Maison extends Bâtiments{
    private int Nb_Pieces;

    public Maison(String adresse, int Nb_Pieces) {
        super(adresse);
        this.Nb_Pieces=Nb_Pieces;
    }
    public int getNb_Pieces() {
        return Nb_Pieces;
    }
    public void setNb_Pieces(int nb_Pieces) {
        Nb_Pieces = nb_Pieces;
    }
    public String toString() {
        return String.format("adresse : %s\nnb_pieces : %s",this.getAdresse(),this.Nb_Pieces);
    }
}

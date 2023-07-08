import java.util.Arrays;
public class Testtab {
    public static void main(String[] args) {
        int money = 2000;
        int pricephone = 1000;
        boolean hasphone = false;
        resultat(money, pricephone, hasphone);
    }

    //        (money, pricephone, hasphone){
    private static int resultat(int money, int pricephone, boolean hasphone) {
        if (money > pricephone && !hasphone) {
            System.out.println("ok take it");
        } else {
            System.out.println("sorry");
        }
        return money - pricephone;
    }
}
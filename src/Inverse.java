public class Inverse {
//ex1
    public static void main(String[] args) {
        String str = "bonjour amine";
        System.out.println(str);
        StringBuilder strb = new StringBuilder(str);
//        StringBuilder class can be used when you want to modify a string without creating a new object.
        str = String.valueOf(strb.reverse());
        System.out.println(strb);
    }
}

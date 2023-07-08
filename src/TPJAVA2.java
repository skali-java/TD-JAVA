public class TPJAVA2 {
    public static void main(String[] args) {
        String str = "RAGE";
        String str2 ="GARE";
        StringBuilder strinverse = new StringBuilder();
        // ajouter la chaîne dans StringBuilder
        strinverse.append(str);
        strinverse = strinverse.reverse();
        System.out.println("la chaine inversée de str est :"+strinverse);
        String str1;
        str1 = String.valueOf(strinverse);
        System.out.println("str2 est :"+str2);

        if(str1.equals(str2)){
            System.out.println( str +" est une ANAGRAMME de "+ str2);
        }
        else {
            System.out.println(str +" n'est pas une ANAGRAMME de "+ str2);
        }
    }
}
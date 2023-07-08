public class function2 {
    public static boolean isPrefix(String word, String prefix) {
        if (word == null || prefix == null) {
            return false; // Si l'un des deux paramètres est null, le préfixe est impossible
        }
        if (prefix.length() > word.length()) {
            return false; // Le préfixe est plus long que le mot, il ne peut pas être un préfixe
        }
        for (int i = 0; i < prefix.length(); i++) {
            if (word.charAt(i) != prefix.charAt(i)) {
                return false; // Les caractères ne correspondent pas, ce n'est pas un préfixe
            }
        }
        return true; // Tous les caractères correspondent, le deuxième string est un préfixe du premier
    }
    public static void main(String[] args) {
        String word = "hugging";
        String prefix = "hug";
        boolean isPrefix = isPrefix(word, prefix);
        System.out.println("Is '" + prefix + "' a prefix of '" + word + "'? " + isPrefix);
    }
}

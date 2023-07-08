import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez definir un code Pin : ");
        Scanner scanner = new Scanner(System.in);
        int nombreATrouver = 1234;
        int tentativesRestantes = 5;

        for (int i = 0; i < 5; i++) {
            System.out.print("Entrez un nombre : ");
            int tentative = scanner.nextInt();

            if (tentative == nombreATrouver) {
                System.out.println("Bravo, vous avez trouvé le nombre !");
                break;
            } else {
                tentativesRestantes--;
                if (tentativesRestantes > 0) {
                    System.out.println("Nombre incorrect. Il vous reste " + tentativesRestantes + " tentatives.");
                } else {
                    System.out.println("Vous avez épuisé toutes vos tentatives. Le nombre était " + nombreATrouver + ".");
                    int codePin = input.nextInt();
                    int codePinATester;
                    do {
                        System.out.print("Entrez le code Pin pour deverouiller l'appareil : ");
                        codePinATester = input.nextInt();
                        if (codePinATester == codePin) {
                            break;
                        }
                        if (codePinATester > 10000) {
                            System system = null;
                            system.out.print("code depasse 4 chiffres, veuillez recommencer. ");
                        }
                        System.out.println("Code Pin incorrect, veuillez recommencer.");
                    } while (true);
                    System.out.println("welcome");
                    do {
                        System.out.print("Entrez le code Pin pour deverouiller l'appareil : ");
                        codePinATester = input.nextInt();
                        if (codePinATester == codePin) {
                            break;
                        }
                        if (codePinATester > 10000) {
                            System system = null;
                            system.out.print("code depasse 4 chiffres ");
                        }
                        System.out.println("Code Pin incorrect, veuillez recommencer.");
                    } while (true);
                    System.out.println("welcome");
                }
            }
        }

        scanner.close();
    }
}

//ajoute un dernier critère pour améliorer l'expérience du programme. Étant donné que l'utilisateur dispose de seulement 5 tentatives, après 2 tentatives incorrectes, nous devons commencer à lui afficher le nombre de tentatives restantes.
//Par exemple, si l'utilisateur saisit deux fois un code PIN incorrect, il doit recevoir un message indiquant : 'Il vous reste x tentatives'. Le 'x' représente le nombre de tentatives restantes

//nombre_de_tentatives = 5
//        tentatives_incorrectes = 0
//
//        while tentatives_incorrectes < 2 and nombre_de_tentatives > 0:
//        # Code pour demander à l'utilisateur de fournir une réponse
//        # et vérifier si la réponse est incorrecte
//
//        if reponse_incorrecte:
//        tentatives_incorrectes += 1
//        nombre_de_tentatives -= 1
//        if tentatives_incorrectes == 2:
//        print("Il vous reste", nombre_de_tentatives, "tentatives.")
//        Étant donné que l'utilisateur dispose de seulement 5 tentatives, après 2 tentatives incorrectes
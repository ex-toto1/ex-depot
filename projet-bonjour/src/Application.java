import java.util.Scanner;

public class Application {
    /**
     * Appelle la méthode saisie() pour demander à l'utilisateur de saisir son nom et son prénom sur la console d’entrée et affiche sur la console de sortie le message "Bonjour" suivi de son nom et son prénom.
     */
    
    public static void main(String[] args) {
    }

    /**
     * Affiche l'invite spécifiée par le paramètre message puis lit au clavier une chaîne saisie par l'utilisateur et la renvoie si elle est non vide. Boucle tant que la chaîne saisie est vide.
     */
    
    private static String saisie(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print(message+" ? ");
        return scan.next();
    }

}

package pendu2018;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Saisie {

    private static final Scanner sc = new Scanner(System.in);

    /**
     *
     * @param message
     * @return
     */
    public static int lireEntier(String message) {
        int read = 0;
        boolean valid = false;
        while(!valid) {
            try {
                System.out.print(message);
                read = sc.nextInt();
                sc.nextLine();
                valid = true;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Mauvaise saisie !");
                sc.nextLine();
            }
        }
        return read;
    }

    public static String lireChaine(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static char lireChar(String message) {
        char c = ' ';
        String s;
        do {
            s = lireChaine(message).trim();
            if(s.length() > 0) {
                c = s.charAt(0);
            } else {

            }
        }while(s.length() == 0);
        return c;
    }

    public static double lireDouble(String message) {
        double read = 0;
        boolean valid = false;
        while(!valid) {
            try {
                System.out.print(message);
                read = sc.nextDouble();
                valid = true;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Mauvaise saisie !");
            } finally {
                sc.nextLine();
            }
        }
        return read;
    }

    /**
     * question de type Oui/Non
     *
     * @param message le message d'invite à afficher
     * @return true si la réponse commence par 'o' ou 'O', false sinon
     */
    public static boolean lireOuiNon(String message) {
        System.out.print(message);
        String rep = sc.nextLine();
        return rep.toUpperCase().startsWith("O");
    }

}

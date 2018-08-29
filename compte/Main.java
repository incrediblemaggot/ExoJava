package td2Class.compte;

/**
 * @author jeromeheissler
 * @version
 * @since
 */
public class Main {

    public static void main(String[] args) {
        Personne p1 = new Personne("DUPONT", "Jean", "Tours");
        Personne p2 = new Personne("DURAND", "Sophie", "8 rue albert thomas");
        Compte c1 = new Compte(p1, 1000);
        Compte c2 = new Compte(p2, 50000, 5000, 6000);
        Compte c3 = new Compte(p2);
        System.out.println(c1);
        System.out.println(c2);
        c1.debiter(300);
        c2.debiter(600);
        c1.crediter(500);
        System.out.println(c1);
        System.out.println(c2);
        c2.virer(15000, c1);
        System.out.println(c1);
        System.out.println(c2);
        c3.debiter(300);
        System.out.println(c3);
    }

}

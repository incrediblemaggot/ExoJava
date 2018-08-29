package pendu2018;

public class Main {

    public static void main(String[] args) {
        String motADeviner;
        do {
            motADeviner = Saisie.lireChaine("Veuillez saisir le mot à deviner : ");
        } while(motADeviner.trim().length() == 0);
        int nbVie = Saisie.lireEntier("Combien voulez-vous d'essaie : ");

        Pendu pendu = new Pendu(motADeviner, nbVie);

        System.out.println("C'est parti !");
        System.out.println(pendu.getMotADevinerCacher());
        boolean gagner = false;
        while(!gagner && pendu.getEssaieRestant() > 0) {
            char c;
            do {
                System.out.println(pendu.getLettreSaisie());
                System.out.println("essaie restant " + pendu.getEssaieRestant());
                c = Saisie.lireChar("Sassisez une lettre : ");
            }while(pendu.lettreDejaSaisie(c));
            if(pendu.checkLettre(c)) {
                System.out.println("Bonne Lettre ! ");
            } else {
                System.out.println("Perdu !");
            }
            System.out.println(pendu.getMotADevinerCacher());
            gagner = pendu.gagner();
        }
        if(gagner) {
            System.out.println("C'est gagné");
        } else {
            System.out.println("Gros naze");
        }
    }

}

package pendu2018;

public class Pendu {

    private String motADeviner;
    private String lettreSaisie;
    private int essaieRestant;

    public Pendu(String motADeviner, int essaieRestant) {
        this.motADeviner = motADeviner;
        this.lettreSaisie = "";
        this.essaieRestant = essaieRestant;
    }

    public String getMotADeviner() {
        return motADeviner;
    }

    public String getMotADevinerCacher() {
        String s = "";
        for(int i = 0; i < motADeviner.length(); i++) {
            if(lettreSaisie.indexOf(motADeviner.charAt(i)) != -1) {
                s += motADeviner.charAt(i);
            } else {
                s += " - ";
            }
        }
        return s;
    }

    public String getLettreSaisie() {
        return lettreSaisie;
    }

    public int getEssaieRestant() {
        return essaieRestant;
    }

    public boolean checkLettre(char c) {
        if( ! this.lettreDejaSaisie(c) ) {
            lettreSaisie += c;
        }
        boolean bonneLettre = motADeviner.indexOf(c) != -1;
        if( ! bonneLettre ) {
            this.essaieRestant --;
        }
        return bonneLettre;
    }

    public boolean lettreDejaSaisie(char c) {
        return lettreSaisie.indexOf(c) != -1;
    }

    public boolean gagner() {
        return motADeviner.equals(getMotADevinerCacher());
    }


}

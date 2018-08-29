package td2Class.bibliotheque;

public class Livre extends Document {

    private String auteur;
    private int nbrPages;

    public Livre(int num, String titre, String auteur, int nbrPages) {
        super(num, titre);
        this.auteur = auteur;
        this.nbrPages = nbrPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    public String toString()    {
        return "Livre : " + super.toString() + " de " + auteur + " (" + nbrPages + " pages)";
    }

}

package td2Class.bibliotheque;

public class Manuel extends Livre {

    private int niveau;

    public Manuel(int num, String titre, String auteur, int nbrPages, int niveau) {
        super(num, titre, auteur, nbrPages);
        this.niveau = niveau;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String toString()    {
        return "Manuel : " + super.toString() + " niveau " + niveau;
    }

}

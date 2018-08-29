package td2Class.bibliotheque;

public class Roman extends Livre {

    private PrixLitteraire prixLitt;

    public Roman(int num, String titre, String auteur, int nbrPages, PrixLitteraire prixLitt) {
        super(num, titre, auteur, nbrPages);
        this.prixLitt = prixLitt;
    }

    public PrixLitteraire getPrixLitt() {
        return prixLitt;
    }

    public void setPrixLitt(PrixLitteraire prixLitt) {
        this.prixLitt = prixLitt;
    }

    public String toString()    {
        return "Roman : " + super.toString() + " prix littéraire  " + prixLitt;
    }

}

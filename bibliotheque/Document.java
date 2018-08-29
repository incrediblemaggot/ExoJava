package td2Class.bibliotheque;

public class Document {

    private final int numEnreg;
    private String titre;

    public Document(int num, String titre)  {
        numEnreg = num;
        this.titre = titre;
    }

    public int getNumEnreg() {
        return numEnreg;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String toString()    {
        return "n°" + numEnreg + " : " + titre;
    }
}

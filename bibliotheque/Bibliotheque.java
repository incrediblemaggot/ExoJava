package td2Class.bibliotheque;

public class Bibliotheque {

    private Document[] documents;
    private int nbDocument;

    /**
     * constructeur qui crée une bibliothèque ayant la capacité indiquée
     *
     * @param capacite nombre maximum de documents que pourra contenir la bibliothèque
     */
    public Bibliotheque(int capacite) {
        documents = new Document[capacite];
        nbDocument = 0;
    }

    /**
     * renvoie le nombre de documents dans la bibliothèque
     *
     * @return le nombre de documents
     */
    public int getNbrDocs() {
        return nbDocument;
    }

    /**
     * renvoie le ième document
     *
     * @param i la position du document
     * @return un document
     */
    public Document document(int i) {
        try {
            return documents[i];
        } catch (IndexOutOfBoundsException exc) {
            return null;
        }
    }

    /**
     * ajoute le document indiqué et renvoie true (false en cas d’échec)
     *
     * @param doc un document à ajouter
     * @return le resultat de l'ajout
     */
    public boolean ajouter(Document doc) {
        if (nbDocument < documents.length) {
            documents[nbDocument++] = doc;
            return true;
        } else {
            return false;
        }
    }

    /**
     * supprime le document indiqué et renvoie true (false en cas d’échec)
     *
     * @param doc le document à supprimer
     * @return le resultat de la suppression
     */
    public boolean supprimer(Document doc) {
        int cursor = 0;
        while (cursor < nbDocument && documents[cursor] != doc) {
            cursor++;
        }
        if (cursor < nbDocument) {
            while (cursor++ < (nbDocument - 1)) {
                documents[cursor] = documents[cursor + 1];
            }
            nbDocument--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * affiche tous les ouvrages de la bibliothèque
     */
    public void afficherDocuments() {
        for (int i = 0; i < nbDocument; i++) {
            System.out.println(documents[i]);
        }
    }

    /**
     * affiche la liste des auteurs de tous les ouvrages qui ont un auteur (au besoin, utilisez l’opérateur instanceof)
     */
    public void afficherAuteurs() {
        for (int i = 0; i < nbDocument; i++) {
            if (documents[i] instanceof Livre)
                System.out.println(((Livre) documents[i]).getAuteur());
        }
    }
}

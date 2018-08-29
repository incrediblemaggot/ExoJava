package td2Class.bibliotheque;

public class TestBibliotheque {
    public static void main(String[] args)  {
        Bibliotheque bibliotheque = new Bibliotheque(2);

        Livre livre = new Livre(3, "Harry Potter", "J. K. Rowling", 4000);

        bibliotheque.ajouter(livre);

        System.out.println("Nombre de document: " + bibliotheque.getNbrDocs());
        bibliotheque.afficherDocuments();
        bibliotheque.afficherAuteurs();

        Document doc = bibliotheque.document(0);
        bibliotheque.supprimer(doc);

        System.out.println("Nombre de document: " + bibliotheque.getNbrDocs());
        bibliotheque.afficherDocuments();
        bibliotheque.afficherAuteurs();

        Revue rev = new Revue(5, "Programmez", 12, 2014);
        bibliotheque.ajouter(livre);
        bibliotheque.ajouter(rev);
        System.out.println("Nombre de document: " + bibliotheque.getNbrDocs());
        bibliotheque.afficherDocuments();
        bibliotheque.afficherAuteurs();

        Roman rom = new Roman(6, "Harry Potter 2", "J. K. Rowling", 4000, PrixLitteraire.GONCOURT);
        bibliotheque.ajouter(rom);
        System.out.println("Nombre de document: " + bibliotheque.getNbrDocs());
        bibliotheque.afficherDocuments();
        bibliotheque.afficherAuteurs();

    }
}

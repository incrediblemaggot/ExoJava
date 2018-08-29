package td2Class.bibliotheque;

public class TestDocuments {
    public static void main(String[] args) {

        Document all[] = new Document[6];

        Dictionnaire dic = new Dictionnaire(1, "Hachette", Langue.Espagnol);
        all[0] = dic;

        Document doc = new Document(2, "Super Document");
        all[1] = doc;

        Livre livre = new Livre(3, "Harry Potter", "J. K. Rowling", 4000);
        all[2] = livre;

        Manuel man = new Manuel(4, "Java Pour les nul", "Pierre Pierre", 200, 0);
        all[3] = man;

        Revue rev = new Revue(5, "Programmez", 12, 2014);
        all[4] = rev;

        Roman rom = new Roman(6, "Harry Potter 2", "J. K. Rowling", 4000, PrixLitteraire.valueOf("a"));
        all[5] = rom;

        for(Document d : all)   {
            System.out.println(d);
        }

    }
}

package td3Collection.annuaire;

import td2Class.cinema.Saisie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static Annuaire a = new Annuaire();

    public static void main(String[] args)  {
        System.out.println("Bienvenu dans l'annuaire");
        commandSelector();
        System.out.print("Bye !!!");
    }

    private static void commandSelector()   {
        String cmd = Saisie.lireChaine("taper votre commande (help ?)");
        // commande bye == fin de boucle
        while(cmd.compareTo("bye") != 0)    {

            // Affiche tout l'annuaire
            if(cmd.compareTo("!") == 0) {
                printData();
                // Affiche l'aide
            }else if(cmd.compareTo("?") == 0)   {
                help();
            }else if(cmd.contains("+") || cmd.matches("\\+[a-zA-Z]+"))  {
                String name = cmd.replace("+", "");
                addFiche(name);

            }else if(cmd.contains("?"))  {
                String name = cmd.replace("?", "");
                searchFiche(name);
            }else   {
                help();
            }

            cmd = Saisie.lireChaine("taper votre commande (help ?)");
        }
    }

    private static void help()  {
        System.out.println("List des commandes disponible : ");
        System.out.println(" - ? : l'aide ");
        System.out.println(" - ! : affichage de toute les listes de l'annuaire ");
        System.out.println(" - +nom : ajout d'une fiche portant le nom ");
        System.out.println(" - ?nom : recherche d'une fiche portant le nom ");
    }

    private static void printData() {
        List<Fiche> data = a.all();

        Collections.sort(data, new NameComparator());

        if(data.isEmpty())  {
            System.out.println("annuaire vide");
        }else   {
            for(Fiche s : data)    {
                System.out.println(s);
            }
        }
    }

    private static void searchFiche(String name)    {
        Fiche f = a.findByName(name);
        if(f == null)   {
            System.out.println("Fiche non trouvé");
        }else   {
            System.out.println(f);
        }
    }

    private static void addFiche(String name)   {
        String phone = Saisie.lireChaine("Saisissez le numéro de téléphone: ");
        String address = Saisie.lireChaine("Saisissez l'adresse: ");
        Fiche f =  new Fiche(name, phone, address);
        a.add(f);
        /*
        a.add(name, phone, address);
        */
    }

}

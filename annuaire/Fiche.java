package td3Collection.annuaire;

public class Fiche {

    private String name;
    private String number;
    private String address;

    public Fiche(String name, String number, String address)    {
        this.name = name;
        this.number = number;
        this.address = address;
    }
    public Fiche(String name, String number)    {
        this(name, number, "");
    }
    public Fiche(String name)   {
        this(name, "", "");
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    //TODO ciyciy

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString()    {
        return "nom: "+name+"\nnuméro de téléphone: "+number+"\naddresse: "+address;
    }
    
}

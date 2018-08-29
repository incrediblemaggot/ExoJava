package td2Class.bibliotheque;

public enum PrixLitteraire {
    GONCOURT("gc"),
    MEDICIS("md"),
    INTERALLIE("in");

    private String champ;

    PrixLitteraire(String champ) {
        this.champ = champ;
    }

    public String getChamp() {
        return champ;
    }

    public String toString() {
        return champ;
    }

    public static PrixLitteraire fromString(String s) {
        switch (s) {
            case "gc": return GONCOURT;
            case "md": return MEDICIS;
            case "in":
            default: return INTERALLIE;
        }
    }
}


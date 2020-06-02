public class Kantinemedewerker extends Persoon {
    private int medewerkersnummer;
    private boolean kankassa;

    public Kantinemedewerker(int bsn, String voornaam, String achternaam, Datum geboortedatum, char geslacht, int medewerkersnummer, boolean kankassa){
        super(bsn, voornaam, achternaam, geboortedatum, geslacht);
        this.medewerkersnummer = medewerkersnummer;
        this.kankassa = kankassa;

    }

    public Kantinemedewerker(int medewerkersnummer, boolean kankassa){
        super();
        this.medewerkersnummer = medewerkersnummer;
        this.kankassa = kankassa;
    }

    public Kantinemedewerker(){
        super();
        medewerkersnummer = 000000;
        kankassa = false;
    }

    public void setMedewerkersnummer(int medewerkersnummer){
        this.medewerkersnummer = medewerkersnummer;
    }

    public void setKankassa(boolean kankassa){
        this.kankassa = kankassa;
    }

    public int getMedewerkersnummer(){ return medewerkersnummer;}

    public boolean getKankassa(){return kankassa;}

    @Override
    public String toString() {
        return "Kantinemedewerker";
    }
}

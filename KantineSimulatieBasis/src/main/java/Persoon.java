public class Persoon {

    private int bsn;
    private String voornaam;
    private String achternaam;
    private Datum geboortedatum;
    private char geslacht;
    private Betaalwijze betaalwijze;

    public Persoon(int bsn, String voornaam, String achternaam, Datum geboortedatum, char geslacht){
        this.bsn = bsn;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        switch (geslacht){
            case 'M':
            case 'V':
                this.geslacht = geslacht;
                break;
                default:
                    this.geslacht = 'O';
                    break;
        }
    }
    public Persoon(){
        bsn = 00000000;
        voornaam = "";
        achternaam = "";
        geboortedatum = new Datum();
        geslacht = 'O';
    }

    public void setBsn(int bsn) {
        this.bsn = bsn;
    }

    public void setVoornaam(String voornaam){
        this.voornaam = voornaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setGeboortedatum(Datum geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public void setGeslacht(char geslacht){
        if(geslacht == 'M' || geslacht == 'V') {
            this.geslacht = geslacht;
        }else {
            this.geslacht = 'O';
            System.out.println("Fout geslacht");
        }
    }

    public void setBetaalwijze(Betaalwijze betaalwijze) {
        this.betaalwijze = betaalwijze;
    }

    public int getBsn(){
        return bsn;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public Datum getGeboortedatum() {
        return geboortedatum;
    }

    public String getGeslacht() {
        if (geslacht == 'M'){
            return "Man";
        }
        else if (geslacht == 'V'){
            return "Vrouw";
        }
        else {
            return "Onbekend";
        }
    }
    public Betaalwijze getBetaalwijze() {return betaalwijze;}

    public String toString(){
        String a = getBsn() + ", ";
        String b = getVoornaam() + ", ";
        String c = getAchternaam() + ", ";
        String d = getGeboortedatum().getDatumAsString() + ", ";
        String e = getGeslacht() + ", ";

        String persoon = String.valueOf(getClass());

        return a + b + c + d + e + persoon;
    }
}


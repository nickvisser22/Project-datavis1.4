public class Docent extends Persoon {

    private String afkorting;
    private String afdeling;

    public Docent(int bsn, String voornaam, String achternaam, Datum geboortedatum, char geslacht, String afkorting, String afdeling){
        super(bsn, voornaam, achternaam, geboortedatum, geslacht);
        this.afkorting = afkorting;
        this.afdeling = afdeling;
    }

    public Docent(String afkorting, String afdeling){
        super();
        this.afkorting = afkorting;
        this.afdeling = afdeling;
    }

    public Docent(){
        super();
        afkorting = "XXXX";
        afdeling = "geen";
    }

    public void setAfkorting(String afkorting){
        this.afkorting = afkorting;
    }

    public void setAfdeling(String afdeling){
        this.afdeling = afdeling;
    }

    public String getAfkorting(){ return afkorting; }

    public String getAfdeling(){ return afdeling; }

    @Override
    public String toString() {
        return "Docent";
    }
}

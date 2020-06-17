public class Docent extends Persoon implements KortingskaartHouder{

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

    /**
     * Methode om kortingspercentage op te vragen
     */
    @Override
    public double geefKortingsPercentage(){
        return 0.25;
    }

    /**
     * Methode om op te vragen of er maximum per keer aan de korting zit
     */
    @Override
    public boolean heeftMaximum(){
        return true;
    }

    /**
     * Methode om het maximum kortingsbedrag op te vragen
     */
    @Override
    public double geefMaximum(){
        return 1.00;
    }
}

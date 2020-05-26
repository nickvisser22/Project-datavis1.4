public class Artikel {

    private String naam;
    private double prijs;

    public Artikel(String naam, double prijs){
        this.naam = naam;
        this.prijs = prijs;
    }

    public Artikel(String naam){
        this.naam = naam;
        prijs = 0;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public String toString(){
        String a = getNaam();
        String b = String.valueOf(getPrijs());

        return a + ": " + b;
    }
}

import java.util.ArrayList;
import java.util.Iterator;

public class Kassa {

    private double totaalGeld;
    private int totaalArtikelen;
    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op. Tel deze gegevens op bij de controletotalen
     * die voor de kassa worden bijgehouden. De implementatie wordt later vervangen door een echte
     * betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant) {
        totaalArtikelen += getAantalArtikelen(klant);
        totaalGeld += getTotaalPrijs(klant);
    }

    private int getAantalArtikelen(Dienblad klant){
        int artikelenDienblad = 0;
        for (int i = 0; i < klant.artikelen.size(); i++){
            artikelenDienblad++;
        }
        return artikelenDienblad;
    }

    private double getTotaalPrijs(Dienblad klant){
        double totaalPrijs = 0.0;
        for(Artikel artikel : klant.artikelen){
            totaalPrijs += artikel.getPrijs();
        }
        return totaalPrijs;
    }
    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd, vanaf het moment dat de methode
     * resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        return totaalArtikelen;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die de kass zijn gepasseerd, vanaf het moment dat
     * de methode resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return totaalGeld;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en de totale hoeveelheid geld in de
     * kassa.
     */
    public void resetKassa() {
        totaalGeld = 0;
        totaalArtikelen = 0;
    }
}

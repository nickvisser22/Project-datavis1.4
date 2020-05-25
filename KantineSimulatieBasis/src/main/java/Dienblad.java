import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Dienblad {
    public Stack<Artikel> artikelen = new Stack<>();
    private Persoon klant;

    /**
     * Constructor
     */
    public Dienblad() {
        // method body omitted
        klant = new Persoon();
    }

    public Dienblad(Persoon klant){
        this.klant = klant;
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param //artikel
     */

    public void setKlant(Persoon klant){
        this.klant = klant;
    }

    public Persoon getKlant(){
        return klant;
    }

    public void voegToe(Artikel artikel) {
        artikelen.add(artikel);
    }

}


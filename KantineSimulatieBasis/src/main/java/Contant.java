public class Contant extends Betaalwijze {
    /**
     * Methode om betaling af te handelen
     */
    public boolean betaal(double tebetalen) {
        // method body omitted
        if (saldo - tebetalen > 0) {
            return true;
        }else return false;
    }
}

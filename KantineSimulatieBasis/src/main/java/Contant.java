public class Contant extends Betaalwijze {
    /**
     * Methode om betaling af te handelen
     */
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        // method body omitted
        if (saldo - tebetalen > 0) {
            saldo -= tebetalen;
        }else throw new TeWeinigGeldException();
    }
}

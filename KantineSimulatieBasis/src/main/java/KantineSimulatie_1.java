//public class KantineSimulatie {
//
//    private Kantine kantine;
//
//    public static final int DAGEN = 7;
//
//    /**
//     * Constructor
//     */
//    public KantineSimulatie() {
//        kantine = new Kantine();
//    }
//
//    /**
//     * Deze methode simuleert een aantal dagen in het
//     * verloop van de kantine
//     *
//     * @param dagen
//     */
//    public void simuleer(int dagen) {
//
//        String[] artikelnamen = {"artikel1", "artiekl2"};
//
//        // herhaal voor elke dag
//        for (int i = 0; i < dagen; i++) {
//            // per dag nu even vast 10 + i personen naar binnen
//            // laten gaan, wordt volgende week veranderd...
//
//            // for lus voor personen
//            for (int j = 0; j < 10 + i; j++) {
//                // kantine.(...);
//                kantine.loopPakSluitAan(new Dienblad(new Persoon()), artikelnamen);
//            }
//
//            // verwerk rij voor de kassa
//            kantine.verwerkRijVoorKassa();
//
//            // toon dagtotalen (artikelen en geld in kassa)
//            System.out.println("aantal artikelen: " + kantine.getKassa().aantalArtikelen());
//            System.out.println("hoeveelheid geld: " + kantine.getKassa().hoeveelheidGeldInKassa());
//            // reset de kassa voor de volgende dag
//            kantine.getKassa().resetKassa();
//        }
//    }
//
//    /**
//     * Start een simulatie
//     */
//    public static void main(String[] args) {
//        int dagen;
//        KantineSimulatie kantinesimulatie = new KantineSimulatie();
//
//        if (args.length == 0) {
//            dagen = DAGEN;
//        } else {
//            dagen = Integer.parseInt(args[0]);
//        }
//        kantinesimulatie.simuleer(dagen);
//    }
//}

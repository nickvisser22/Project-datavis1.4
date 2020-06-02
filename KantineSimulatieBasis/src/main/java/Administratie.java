public class Administratie {

    private final static int DAYS_IN_WEEK = 7;

    private Administratie(){

    }
    /**
     * Deze methode berekent van de int array aantal de gemiddelde waarde
     *
     * @param aantal
     * @return het gemiddelde
     */
    public static double berekenGemiddeldAantal(int[] aantal) {
        double counter = 0;
        for (double artikel : aantal) {
            counter += artikel;
        }
        return counter / aantal.length;
    }

    /**
     * Deze methode berekent van de double array omzet de gemiddelde waarde
     *
     * @param omzet
     * @return het gemiddelde
     */
    public static double berekenGemiddeldeOmzet(double[] omzet) {
        double counter = 0;
        for (double dagOmzet : omzet) {
            counter += dagOmzet;
        }
        return counter / omzet.length;
    }

    /**
     * Methode om dagomzet uit te rekenen
     *
     * @param omzet
     * @return array (7 elementen) met dagomzetten
     */

    public static double[] berekenDagOmzet(double[] omzet) {
        double[] temp = new double[7];
        for(int i = 0; i < DAYS_IN_WEEK; i++) {
            int j = 0;
            while (i + DAYS_IN_WEEK * j < omzet.length) {
                temp[i] += omzet[i + DAYS_IN_WEEK * j];
                j++;
            }
        }
        return temp;
    }
}

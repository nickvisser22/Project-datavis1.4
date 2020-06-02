import java.util.*;

public class KantineSimulatie {
    // dagen
    private static final int DAGEN = 7;

    // kantine
    private Kantine kantine;

    // kantineaanbod
    private KantineAanbod kantineaanbod;

    // random generator
    private Random random;

    // aantal artikelen
    private static final int AANTAL_ARTIKELEN = 4;

    // artikelen
    private static final String[] artikelnamen =
            new String[] {"Koffie", "Broodje pindakaas", "Broodje kaas", "Appelsap"};

    // prijzen
    private static double[] artikelprijzen = new double[] {1.50, 2.10, 1.65, 1.65};

    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT = 10;
    private static final int MAX_ARTIKELEN_PER_SOORT = 20;

    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG = 50;
    private static final int MAX_PERSONEN_PER_DAG = 100;

    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON = 1;
    private static final int MAX_ARTIKELEN_PER_PERSOON = 4;

    /**
     * Constructor
     *
     */
    public KantineSimulatie() {
        kantine = new Kantine();
        random = new Random();
        int[] hoeveelheden =
                getRandomArray(AANTAL_ARTIKELEN, MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
        kantineaanbod = new KantineAanbod(artikelnamen, artikelprijzen, hoeveelheden);

        kantine.setKantineAanbod(kantineaanbod);
    }

    /**
     * Methode om een array van random getallen liggend tussen min en max van de gegeven lengte te
     * genereren
     *
     * @param lengte
     * @param min
     * @param max
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max) {
        int[] temp = new int[lengte];
        for (int i = 0; i < lengte; i++) {
            temp[i] = getRandomValue(min, max);
        }

        return temp;
    }

    /**
     * Methode om een random getal tussen min(incl) en max(incl) te genereren.
     *
     * @param min
     * @param max
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Methode om op basis van een array van indexen voor de array artikelnamen de bijhorende array
     * van artikelnamen te maken
     *
     * @param indexen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) {
        String[] artikelen = new String[indexen.length];

        for (int i = 0; i < indexen.length; i++) {
            artikelen[i] = artikelnamen[indexen[i]];

        }

        return artikelen;
    }

    /**
     * Deze methode simuleert een aantal dagen
     * in het verloop van de kantine
     *
     * @param dagen
     */
    public void simuleer(int dagen) {
        // for lus voor dagen
        double[] omzet = new double[dagen];
        int[] aantal = new int[dagen];

        for(int i = 0; i < dagen; i++) {

            // bedenk hoeveel personen vandaag binnen lopen
            int aantalpersonen = getRandomValue(MIN_PERSONEN_PER_DAG, MAX_PERSONEN_PER_DAG);

            // laat de personen maar komen...
            for (int j = 0; j < aantalpersonen; j++) {
                int rand = random.nextInt(100);

                    // maak persoon en dienblad aan, koppel ze
                    // en bedenk hoeveel artikelen worden gepakt
                    int aantalartikelen = getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);

                    // genereer de "artikelnummers", dit zijn indexen
                    // van de artikelnamen
                    int[] tepakken = getRandomArray(aantalartikelen, 0, AANTAL_ARTIKELEN - 1);

                    // vind de artikelnamen op basis van
                    // de indexen hierboven
                    String[] artikelen = geefArtikelNamen(tepakken);

                if(rand > 10) {
                    Dienblad dienblad = new Dienblad(new Student());
                    for (int x = 0; x < aantalartikelen; x++) {
                        dienblad.voegToe(new Artikel(artikelen[x], artikelprijzen[tepakken[x]]));
                    }
                    kantine.loopPakSluitAan(dienblad, artikelen);
                    System.out.println(dienblad.getKlant().toString());
                }else if(rand > 0){
                    Dienblad dienblad = new Dienblad(new Docent());
                    for (int x = 0; x < aantalartikelen; x++) {
                        dienblad.voegToe(new Artikel(artikelen[x], artikelprijzen[tepakken[x]]));
                    }
                    kantine.loopPakSluitAan(dienblad, artikelen);
                    System.out.println(dienblad.getKlant().toString());
                }else{
                    Dienblad dienblad = new Dienblad(new Kantinemedewerker());
                    for (int x = 0; x < aantalartikelen; x++) {
                        dienblad.voegToe(new Artikel(artikelen[x], artikelprijzen[tepakken[x]]));
                    }
                    kantine.loopPakSluitAan(dienblad, artikelen);
                    System.out.println(dienblad.getKlant().toString());
                }

                    // loop de kantine binnen, pak de gewenste artikelen, sluit aan
                    // artikelen[x] kan ook vervangen worden door artikelnamen[tepakken[x]]
//                    for (int x = 0; x < aantalartikelen; x++) {
//                        dienblad.voegToe(new Artikel(artikelen[x], artikelprijzen[tepakken[x]]));
//                    }
//                    kantine.loopPakSluitAan(dienblad, artikelen);
//                    System.out.println(dienblad.getKlant().toString());


            }

            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();
            omzet[i] = kantine.getKassa().hoeveelheidGeldInKassa();
            aantal[i] = kantine.getKassa().aantalArtikelen();

            // druk de dagtotalen af en hoeveel personen binnen zijn gekomen
            System.out.println("aantal artikelen: " + kantine.getKassa().aantalArtikelen());
            System.out.println("hoeveelheid geld: " + kantine.getKassa().hoeveelheidGeldInKassa());
            System.out.println("aantal personen: " + aantalpersonen);

            // reset de kassa voor de volgende dag
            kantine.getKassa().resetKassa();
        }

        System.out.println(Administratie.berekenGemiddeldeOmzet(omzet));
        System.out.println(Arrays.toString(Administratie.berekenDagOmzet(omzet)));
        System.out.println(Administratie.berekenGemiddeldAantal(aantal));
    }

    /**
     * Start een simulatie
     */
    public static void main(String[] args) {
        int dagen;
        KantineSimulatie kantinesimulatie = new KantineSimulatie();

        if (args.length == 0) {
            dagen = DAGEN;
        } else {
            dagen = Integer.parseInt(args[0]);
        }
        kantinesimulatie.simuleer(dagen);

    }



}



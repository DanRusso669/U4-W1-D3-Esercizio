package esercizio2.entities;

import java.util.Arrays;

public class SchedaSim {

    private int phoneNumber;
    private double credito;
    private Chiamata[] chiamate = {
            new Chiamata(3, 123456),
            new Chiamata(5, 456123),
            new Chiamata(10, 789987),
            new Chiamata(5.55, 147741),
            new Chiamata(8.47, 852258),
    };

    // COSTRUTTORI

    public SchedaSim(int numero) {
        this.phoneNumber = numero;
        this.credito = 0;
    }

    static public void stampaDatiSim(SchedaSim sim) {
        System.out.println("Il numero della SIM è: " + sim.phoneNumber);
        System.out.println("Il credito residuo è: " + sim.credito);
        System.out.println("Le ultime chiamate sono: " + Arrays.toString(sim.chiamate));
    }


}

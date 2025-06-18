package esercizio2.entities;

public class Chiamata {
    private double durata;
    private int calledNumber;

    // COSTRUTTORI

    public Chiamata(double durata, int numero) {
        this.durata = durata;
        this.calledNumber = numero;
    }

    @Override
    public String toString() {
        return "Chiamata -> " +
                "durata: " + durata +
                ", calledNumber: " + calledNumber;
    }
}

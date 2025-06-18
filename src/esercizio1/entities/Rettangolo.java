package esercizio1.entities;

public class Rettangolo {
    // ATTRIBUTI

    private double height;
    private double width;

    // COSTRUTTORI

    public Rettangolo(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // METODI

    static public void stampaDueRettangoli(Rettangolo primo, Rettangolo secondo) {
        System.out.println("L'area e il perimetro del primo rettangolo sono: " + primo.getArea() + " e " + primo.getPerimetro());
        System.out.println("L'area e il perimetro del secondo rettangolo sono: " + secondo.getArea() + " e " + secondo.getPerimetro());
        System.out.println("La somma dell'area e del perimetro dei due rettangoli sono: " + (primo.getArea() + secondo.getArea()) + " e " + (primo.getPerimetro() + secondo.getPerimetro()));
    }

    static public void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("L'area e il perimetro del rettangolo sono: " + rettangolo.getArea() + " e " + rettangolo.getPerimetro());
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimetro() {
        return 2 * (this.width + this.height);
    }
}

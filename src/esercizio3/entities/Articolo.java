package esercizio3.entities;

import java.util.Random;

public class Articolo {
    Random r = new Random();
    private int code;
    private String description;
    private int price;
    private int inStock;

    // COSTRUTTORI

    public Articolo(String description, int price, int inStock) {
        this.code = r.nextInt(100, 10000);
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    // METODI

    static public void stampaArticolo(Articolo articolo) {
        System.out.println(articolo);
    }

    @Override
    public String toString() {
        return "Articolo: " +
                "code=" + code +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", inStock=" + inStock;
    }
}

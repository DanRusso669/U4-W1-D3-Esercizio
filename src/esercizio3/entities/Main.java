package esercizio3.entities;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Mario Rossi", "epicode@epi.com");

        Cliente.stampaCliente(cliente1);

        Articolo articolo1 = new Articolo("Palla da tennis", 30, 5);

        Articolo.stampaArticolo(articolo1);
    }
}

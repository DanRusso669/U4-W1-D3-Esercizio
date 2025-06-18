package esercizio1.entities;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(5, 10);
        Rettangolo rettangolo2 = new Rettangolo(3, 5);

        // Rettangolo.stampaRettangolo(rettangolo1);
        // Rettangolo.stampaRettangolo(rettangolo2);

        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}

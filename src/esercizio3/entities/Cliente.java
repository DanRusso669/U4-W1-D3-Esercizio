package esercizio3.entities;

import java.time.LocalDate;
import java.util.Random;

public class Cliente {
    private final int customerCode;
    private final LocalDate signUpDate;
    Random r = new Random();
    LocalDate today = LocalDate.now();
    private String fullName;
    private String email;
    // COSTRUTTORI

    public Cliente(String fullName, String email) {
        this.customerCode = r.nextInt(100, 10000);
        this.fullName = fullName;
        this.email = email;
        this.signUpDate = today;
    }

    // METODI

    public void stampaCliente() {
        System.out.println("Il nome del cliente sono: " + this.fullName);
        System.out.println("La sua email è: " + this.email);
        System.out.println("La sua data di iscrizione è: " + this.signUpDate);
        System.out.println("Il suo codice cliente è: " + this.customerCode);
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

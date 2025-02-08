package main;

import it.gestione.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ✅ Creiamo il sistema di gestione della rete autostradale
        GestioneReteAs sistema = new GestioneReteAs();

        // ✅ Creiamo le città
        Citta c0 = new Citta("Lamezia Terme", "CZ", "Calabria");
        Citta c1 = new Citta("Rende", "CS", "Calabria");
        Citta c2 = new Citta("Milano", "MI", "Lombardia");
        Citta c3 = new Citta("Roma", "RM", "Lazio");
        Citta c4 = new Citta("Firenze", "FI", "Toscana");
        Citta c5 = new Citta("Torino", "TO", "Piemonte");

        sistema.aggiungiCitta(c0);
        sistema.aggiungiCitta(c1);
        sistema.aggiungiCitta(c2);
        sistema.aggiungiCitta(c3);
        sistema.aggiungiCitta(c4);
        sistema.aggiungiCitta(c5);

        // ✅ Creiamo le tratte
Tratta t0 = new Tratta("cod00", "tratta0", c0, c1, 80.5);
Tratta t1 = new Tratta("cod01", "tratta1", c3, c1, 516.5);
Tratta t2 = new Tratta("cod02", "tratta2", c3, c4, 277.0);
Tratta t3 = new Tratta("cod03", "tratta3", c4, c2, 302.0);
Tratta t4 = new Tratta("cod04", "tratta4", c5, c2, 141.0);


        sistema.aggiungiTratta(t0);
        sistema.aggiungiTratta(t1);
        sistema.aggiungiTratta(t2);
        sistema.aggiungiTratta(t3);
        sistema.aggiungiTratta(t4);

        // ✅ Creiamo gli autoveicoli
        Autoveicolo a0 = new Autoveicolo("XXX", "ALF", 2400);
        Autoveicolo a1 = new Autoveicolo("YYY", "MER", 1600);
        Autoveicolo a2 = new Autoveicolo("ZZZ", "VOL", 1900);
        Autoveicolo a3 = new Autoveicolo("WWW", "REN", 1600);

        sistema.aggiungiAutoveicolo(a0);
        sistema.aggiungiAutoveicolo(a1);
        sistema.aggiungiAutoveicolo(a2);
        sistema.aggiungiAutoveicolo(a3);

        // ✅ Creiamo le percorrenze
        sistema.aggiungiPercorrenza(new Percorrenza(t0, a0, 1));
        sistema.aggiungiPercorrenza(new Percorrenza(t0, a1, 1));
        sistema.aggiungiPercorrenza(new Percorrenza(t1, a1, 2));
        sistema.aggiungiPercorrenza(new Percorrenza(t2, a2, 2));
        sistema.aggiungiPercorrenza(new Percorrenza(t3, a3, 2));
        sistema.aggiungiPercorrenza(new Percorrenza(t4, a0, 2));
        sistema.aggiungiPercorrenza(new Percorrenza(t2, a2, 3));
        sistema.aggiungiPercorrenza(new Percorrenza(t3, a3, 3));
        sistema.aggiungiPercorrenza(new Percorrenza(t4, a3, 4));

        // ✅ TEST DEI METODI
        System.out.println("🔹 (Test 1) Auto con percorsi sotto 300 km: " + sistema.trovaAutoveicoli(300));
        System.out.println("🔹 (Test 2) Accessi a Rende: " + sistema.accessi(c1));
        System.out.println("🔹 (Test 3) Auto più usata tra date 2 e 4: " + sistema.trovaAutoFrequente(2, 4));
        System.out.println("🔹 (Test 4) Città più gettonate: " + sistema.cittaGettonate());
    }
}

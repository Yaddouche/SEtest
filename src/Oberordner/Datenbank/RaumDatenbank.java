package Oberordner.Datenbank;

import Oberordner.Logik.IRaumDatenbank;

import Oberordner.Logik.Objekte.Raum;


import java.util.ArrayList;


public class RaumDatenbank implements IRaumDatenbank {

    private static ArrayList<Raum> verfuegbareRaeume;
    private static ArrayList<Raum> belegteRaeume;
    private static ArrayList<Raum> alleRaeume;

    public static Raum audimax = new Raum("Audimax", 1, true);
    public static Raum bibliothek = new Raum("Bibliothek", 2, true);
    public static Raum mu13 = new Raum("MU13", 3, true);

    public static RaumDatenbank raumDatenbank = new RaumDatenbank();

    public RaumDatenbank() {
        verfuegbareRaeume = new ArrayList<>();
        belegteRaeume = new ArrayList<>();
        alleRaeume = new ArrayList<>();
    }

    public void speicherAlleRaeume(Raum raum) {
        alleRaeume.add(raum);

    }

    public static void speicherVerfuegbarenRaum(Raum raum) {
        verfuegbareRaeume.add(raum);
    }

    public static void speicherBelegtenRaum(Raum raum) {
        belegteRaeume.add(raum);
    }


    // Hier werden Raeume entfernt von den Sets bei Stornierungen / Buchungen
    public static void entferneVerfuegbarenRaum(Raum raum) {
        verfuegbareRaeume.remove(raum);
    }

    public static void entferneBelegtenRaum(Raum raum) {
        belegteRaeume.remove(raum);
    }


    //ToDo: Verfuegbare Raeume anzeigen
    public static void ladeVerfuegbareRaeume() {
        for (Raum raum : verfuegbareRaeume) {
            System.out.println(raum);
        }
    }


    //ToDo: Belegte Raeume anzeigen
    public static void ladeBelegteRaeume() {
        for (Raum raum : belegteRaeume) {
            System.out.println(raum);
        }
    }


    //ToDo: Alle Raeume anzeigen
    public static ArrayList<Raum> ladeAlleRaeume() {
        Raum audimax = new Raum("Audimax", 1, true);
        Raum bibliothek = new Raum("Bibliothek", 2, true);
        Raum mu13 = new Raum("MU13", 3, true);
        raumDatenbank.speicherAlleRaeume(audimax);
        raumDatenbank.speicherAlleRaeume(bibliothek);
        raumDatenbank.speicherAlleRaeume(mu13);


        return alleRaeume;

    }

    public static void zeigeAlleRaeume() {
        for (Raum raum : ladeAlleRaeume()) {
            System.out.println(raum);
        }
    }

    public static void main(String[] args) {

    }


}



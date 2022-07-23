package Oberordner.Datenbank;

import Oberordner.Logik.IRaumDatenbank;
import Oberordner.Objekte.Raum;

import java.util.ArrayList;


public class RaumDatenbank implements IRaumDatenbank {

    private static ArrayList<Raum> verfuegbareRaeume = new ArrayList<>();
    private static ArrayList<Raum> belegteRaeume = new ArrayList<>();
    private static ArrayList<Raum> alleRaeume = new ArrayList<>();

    Raum audimax = new Raum("Audimax", 1, true);
    Raum bibliothek = new Raum("Bibliothek", 2, true);
    Raum mu13 = new Raum("MU13",3,true);

    // Hier werden die Raeume zu den Array Listen hinzugefügt um den Überblick über die Raeume zu behalten

    public void speicherAlleRaeume(Raum raum){
        alleRaeume.add(audimax);
        alleRaeume.add(bibliothek);
        alleRaeume.add(mu13);
    }

    public void speicherVerfuegbarenRaum(Raum raum) {
        verfuegbareRaeume.add(raum);
    }

    public static void speicherBelegtenRaum(Raum raum) {
        belegteRaeume.add(raum);
    }



    // Hier werden Raeume entfernt von den Sets bei Stornierungen / Buchungen
    public static void entferneVerfuegbarenRaum(Raum raum) {
        verfuegbareRaeume.remove(raum);
    }
    public void entferneBelegtenRaum(Raum raum) {
        belegteRaeume.remove(raum);
    }




    //ToDo: Verfuegbare Raeume anzeigen
    public static String ladeVerfuegbareRaeume() {
        String raueme = "";
        for(Raum raum : verfuegbareRaeume) {
            raueme += raum+"\n";
        }
        return raueme;
    }

    //ToDo: Belegte Raeume anzeigen
    public static String ladeBelegteRaeume() {
        String raueme = "";
        for(Raum raum : belegteRaeume) {
            raueme += raum+"\n";
        }
        return raueme;
    }

    //ToDo: Alle Raeume anzeigen
    public static String ladeAlleRaeume() {
        String raueme = "";
        for(Raum raum : alleRaeume) {
            raueme += raum+"\n";
        }
        return raueme;
    }
}



package Oberordner.Logik;

import Oberordner.Datenbank.RaumDatenbank;
import Oberordner.Logik.Objekte.Benutzer;
import Oberordner.Logik.Objekte.Raum;
import Oberordner.UI.IRaumBuchung;


public class RaumBuchung implements IRaumBuchung {

    public static String bucheRaum(Raum raum) {
        String ausgabe = "";

        if (raum.getVerfuegbarkeit()) {
            RaumDatenbank.speicherBelegtenRaum(raum);
            raum.setVerfuegbarkeit(false);
            Benutzer.fuegeBuchungHinzu(raum);
            ausgabe = "Sie haben den Raum: " + raum.getName() + " erfolgreich gebucht.";
        }

        else if (!raum.getVerfuegbarkeit()) {
            ausgabe = "Der Raum " + raum.getName() + " ist leider bereits belegt.";
        }
        return ausgabe;
    }

    public static String storniereBuchung(Raum raum) {
        return "";
    }
}



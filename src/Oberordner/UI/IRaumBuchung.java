package Oberordner.UI;

import Oberordner.Logik.Objekte.Raum;

public interface IRaumBuchung {


    static void registriereBenutzer() {
    }

    static void loginBenutzer() {
    }

    static boolean pruefePasswort(String passwort){
        return false;
    }

    static String bucheRaum(Raum raum) {
        return null;
    }


    static String storniereBuchung(Raum raum) {
        return null;
    }
}
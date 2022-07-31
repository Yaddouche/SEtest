package Oberordner.UI;

import Oberordner.Objekte.Raum;

public interface IRaumBuchung {


    static void registriereBenutzer() {
    }

    static void loginBenutzer() {

    }

    static boolean pruefePasswort(String passwort){
        return false;
    }

    static void bucheRaum(Raum raum) {}


    static void storniereBuchung(Raum raum) {}
}
package Oberordner.UI;


import Oberordner.Objekte.Benutzer;


import static Oberordner.Datenbank.RaumDatenbank.zeigeAlleRaeume;
import static Oberordner.Logik.IBenutzerDatenbank.ladeBenutzer;

import static Oberordner.Logik.RaumBuchung.starteProgramm;

public class Main {

    public static void main(String[] args) {

        zeigeAlleRaeume();
        starteProgramm();


        Benutzer sami = new Benutzer("sami", "abc");

        ladeBenutzer();

    }
}

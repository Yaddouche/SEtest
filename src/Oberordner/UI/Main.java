package Oberordner.UI;


import Oberordner.Datenbank.BenutzerDatenbank;

import static Oberordner.Datenbank.BenutzerDatenbank.ladeBenutzer;
import static Oberordner.Logik.RaumBuchung.starteProgramm;

public class Main {

    public static void main(String[] args) {

       starteProgramm();
    ladeBenutzer();

    }
}

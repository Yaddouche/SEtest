package Oberordner.Datenbank;

import Oberordner.Objekte.Benutzer;
import Oberordner.Logik.IBenutzerDatenbank;

import java.util.ArrayList;

public class BenutzerDatenbank implements IBenutzerDatenbank {

    private static ArrayList<Benutzer> alleBenutzer;

    public static BenutzerDatenbank benutzerDatenbank = new BenutzerDatenbank();

    public BenutzerDatenbank() {
        alleBenutzer = new ArrayList<>();

    }

    public void speicherBenutzer(String name, String passwort) {

        alleBenutzer.add(new Benutzer(name, passwort));
    }

    /**
     * Soll alle in der Arraylist registrierten Benutzer ausgeben
     */

    public static void ladeBenutzer() {
        for (Benutzer benutzer : alleBenutzer) {
            System.out.println(benutzer);
        }

    }

    public static boolean existiertBenutzer(String name) {
        boolean existiert = false;
        for (Benutzer benutzer : alleBenutzer) {
            if (benutzer.getName() == name) {
                existiert = true;
                break;
            }
        }
        return existiert;
    }




}
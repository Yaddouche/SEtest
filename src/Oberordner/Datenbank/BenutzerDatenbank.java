package Oberordner.Datenbank;

import Oberordner.Logik.Objekte.Benutzer;
import Oberordner.Logik.IBenutzerDatenbank;
import Oberordner.Logik.Objekte.Raum;

import java.util.ArrayList;

public class BenutzerDatenbank implements IBenutzerDatenbank {

    public static ArrayList<Benutzer> alleBenutzer = new ArrayList<>();
    public static ArrayList<Raum> meineBuchungen;



    public BenutzerDatenbank () {
    this.alleBenutzer = new ArrayList<>();
    meineBuchungen = new ArrayList<>();
    }

    public static void speicherBenutzer(String name, String passwort) {

        alleBenutzer.add(new Benutzer(name,passwort));
    }

    /**
     * Soll alle in der Arraylist registrierten Benutzer ausgeben
     */
    // ToDo: Wieso zeigt es keine gespeicherten Elemente ??
    public static void ladeBenutzer() {
        for (int i = 0; i < alleBenutzer.size(); i++) {
            System.out.println(alleBenutzer);
        }

    }
    //ToDo: zeige Elemente der ArrayList
      public static void zeigeMeineBuchungen() {
        for (int i = 0; i < meineBuchungen.size(); i++) {
            System.out.println(meineBuchungen.get(i));
        }
    }





}

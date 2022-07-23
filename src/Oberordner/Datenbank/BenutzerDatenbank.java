package Oberordner.Datenbank;

import Oberordner.Objekte.Benutzer;
import Oberordner.Logik.IBenutzerDatenbank;
import Oberordner.Objekte.Raum;

import java.util.ArrayList;

public class BenutzerDatenbank implements IBenutzerDatenbank {

    private static ArrayList<Benutzer> alleBenutzer = new ArrayList<>();
    private static ArrayList<Raum> meineBuchungen = new ArrayList<>();



    @Override
    public void speicherBenutzer(Benutzer neuerBenutzer) {
        alleBenutzer.add(neuerBenutzer);
    }



    public String ladeBenutzer(int benutzerID) {

        return null;
    }
}

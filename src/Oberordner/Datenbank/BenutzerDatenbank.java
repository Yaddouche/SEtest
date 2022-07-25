package Oberordner.Datenbank;

import Oberordner.Logik.Objekte.Benutzer;
import Oberordner.Logik.IBenutzerDatenbank;
import Oberordner.Logik.Objekte.Raum;

import java.util.ArrayList;

public class BenutzerDatenbank implements IBenutzerDatenbank {

    public static ArrayList<Benutzer> alleBenutzer = new ArrayList<>();
    public static ArrayList<Raum> meineBuchungen = new ArrayList<>();




    @Override
    public void speicherBenutzer(Benutzer neuerBenutzer) {
        alleBenutzer.add(neuerBenutzer);
    }



    public static ArrayList<Benutzer> ladeAlleBenutzer() {

        return alleBenutzer;
    }

    //ToDo: zeige Elemente der ArrayList
    public void zeigeMeineBuchungen () {
       System.out.println(meineBuchungen.listIterator());
    }
}

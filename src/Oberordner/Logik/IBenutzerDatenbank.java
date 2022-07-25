package Oberordner.Logik;

import Oberordner.Logik.Objekte.Benutzer;

import java.util.ArrayList;

public interface IBenutzerDatenbank {



    void speicherBenutzer(Benutzer neuerBenutzer);

    static ArrayList<Benutzer> ladeAlleBenutzer() {
        return null;
    }

}

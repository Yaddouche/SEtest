package Oberordner.Logik;

import Oberordner.Objekte.Benutzer;

public interface IBenutzerDatenbank {

    void speicherBenutzer(Benutzer neuerBenutzer);
    String ladeBenutzer(int benutzer);

}

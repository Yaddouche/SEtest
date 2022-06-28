package Oberordner.Datenbank;

import Oberordner.Logik.InterfaceRaumSpeicher;
import Oberordner.Logik.Raum;

import java.util.ArrayList;

////@Author Sami Yaddouche, Lena Hartmann
public class RaumDatenbank implements InterfaceRaumSpeicher {

    private ArrayList<Raum> verfuegbareRaeume = new ArrayList<>();
    private ArrayList<Raum> belegteRaeume = new ArrayList<>();



    // Hier werden die Raeume zu den Sets hinzugefügt um den Überblick über die Raeume zu behalten
    public void speicherVerfuegbarenRaum(Raum raum) {
        verfuegbareRaeume.add(raum);
    }
    public void speicherBelegtenRaum(Raum raum) {
        belegteRaeume.add(raum);
    }

    // Hier werden Raeume entfernt von den Sets bei Stornierungen / Buchungen
    public void entferneVerfuegbarenRaum(Raum raum) {
        verfuegbareRaeume.remove(raum);
    }
    public void entferneBelegtenRaum(Raum raum) {
        belegteRaeume.remove(raum);
    }




    //ToDo: Hier sollen alle Verfuegbaren Raeume der ArrayListe angezeigt werden
    public String ladeVerfuegbareRaeume() {
        String raueme = "";
        for(Raum raum : verfuegbareRaeume) {
            raueme += raum+"\n";
        }
        return raueme;
    }

    //ToDo: Hier sollen alle belegten Raeume angezeigt werden
    public String ladeBelegteRaeume() {
        String raueme = "";
        for(Raum raum : belegteRaeume) {
            raueme += raum+"\n";
        }
        return raueme;
    }

}



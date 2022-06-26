package Oberordner.Datenbank;

import Oberordner.Logik.Raum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//ToDo: Diese Klasse als Speicher nutzen?
public class RaumDatenbank {

  protected  ArrayList<Raum> verfuegbareRaeume = new ArrayList<>();
  protected  ArrayList<Raum> belegteRaeume = new ArrayList<>();


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




    //ToDo: Hier sollen alle Verfuegbaren Raeume des Sets angezeigt werden
    public void ladeVerfuegbareRaume() {
        for(Raum raeume : verfuegbareRaeume) {
            System.out.println(verfuegbareRaeume);
        }
    }

    //ToDo: Hier sollen alle belegten Raeume angezeigt werden
    public void ladeBelegteRaeume() {
        for(Raum raum : belegteRaeume) {
            System.out.println(belegteRaeume);
        }
    }

}


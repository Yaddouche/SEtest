package Oberordner.Logik;

import Oberordner.Logik.Objekte.Raum;

//@ Author Sami Yaddouche, Lena Hartmann
public interface IRaumDatenbank {

    static void speicherVerfuegbarenRaum(Raum raum) {
    }

    static void speicherBelegtenRaum(Raum raum) {
    }

    static String ladeVerfuegbareRaeume() {
        return null;
    }

    static String ladeBelegteRaeume() {
        return null;
    }

}
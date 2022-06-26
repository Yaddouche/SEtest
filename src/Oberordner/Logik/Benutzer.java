package Oberordner.Logik;

import Oberordner.UI.InterfaceBenutzer;
import Oberordner.Datenbank.RaumDatenbank;

import java.util.ArrayList;

public class Benutzer implements InterfaceBenutzer {
    protected String name;
    protected ArrayList<Raum> meineBuchungen = new ArrayList<>();

    //Konstruktor
    public Benutzer(String name) {
        this.name = name;
    }

    // Datenbank
    protected RaumDatenbank datenbank = new RaumDatenbank();

    // (1)Benutzer bucht einen Raum (2) Verfügbarkeit des Raum geändert (3) Raum wurde zu meineBuchungen hinzugefügt
    @Override
    public String bucheRaum(Raum raum) {
        String ausgabe = "";

        if (raum.getVerfuegbarkeit()) {
            raum.setVerfuegbarkeit(false);
            meineBuchungen.add(raum);
            datenbank.speicherBelegtenRaum(raum);
            datenbank.entferneVerfuegbarenRaum(raum);
            ausgabe = "Sie haben den Raum " + raum + " erfolgreich gebucht.";

        } else if (raum.getVerfuegbarkeit() == false) {
            ausgabe = "Der Raum " + raum + "ist bereits belegt.";
        }
        return ausgabe;
    }


    // (1)Benutzer storniert Raum (2)Verfügbarkeit wird geändert (3)Raum von meineBuchungen gelöscht
    @Override
    public String storniereRaum(Raum raum) {
        String ausgabe = "";
        if (raum.getVerfuegbarkeit() == false) {
            raum.setVerfuegbarkeit(true);
            meineBuchungen.remove(raum);
            datenbank.speicherVerfuegbarenRaum(raum);
            datenbank.entferneBelegtenRaum(raum);
            ausgabe = "Sie haben die Buchung des Raumes " + raum + " erfolgreich storniert.";
        } else if (raum.getVerfuegbarkeit()) {
            ausgabe = "Der von ihnen angegebene Raum " + raum + " ist nicht gebucht\nHaben Sie den richtigen Raum eingegeben ?";
        }

        return ausgabe;
    }

    //TODO: Wie zeigt man Objekte mit Namen an anstatt Raum@5bf6742 ?  Bsp: Raum Audimax, Raum 103 etc.?
    @Override
    public String zeigeMeineBuchungen() {
        return "Meine Buchungen: " + meineBuchungen;
    }

    @Override
    public String zeigeVerfuegbareRaeume() {
        String ausgabe = "";
        ausgabe = "Verfügbaren Raeume: " + datenbank.ladeVerfuegbareRaume();
        return ausgabe;
    }
}


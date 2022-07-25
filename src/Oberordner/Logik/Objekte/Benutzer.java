package Oberordner.Logik.Objekte;

import java.util.ArrayList;

import Oberordner.Datenbank.BenutzerDatenbank;
import Oberordner.UI.IBenutzer;

import static Oberordner.Datenbank.BenutzerDatenbank.alleBenutzer;

//@Author Sami Yaddouche
public class Benutzer implements IBenutzer {
    private String name;
    private static String passwort;
    private int benutzerID;

    private static ArrayList<Raum> meineBuchungen = new ArrayList<>();

    //Konstruktor
    public Benutzer(String name, String passwort) {
        this.name = name;
        this.passwort = passwort;
        this.benutzerID = benutzerID+1;
    }

    @Override
    public String bucheRaum(Raum raum) {
        return null;
    }

    @Override
    public String storniereRaum(Raum raum) {
        return null;
    }

    @Override
    public String zeigeMeineBuchungen() {
        return null;
    }

    @Override
    public String zeigeVerfuegbareRaeume() {
        return null;
    }

    /*
        // Datenbank
        protected RaumDatenbank raumDatenbank = new RaumDatenbank();

        // (1)Benutzer bucht einen Raum (2) Verfügbarkeit des Raum geprüft (3) geändert wenn verfügbar (4) zur Datenbank hinzugefügt (5)zu meineBuchungen hinzugefügt
        @Override
        public String bucheRaum(Raum raum) {
            String ausgabe = "";

            if (raum.getVerfuegbarkeit()) {

                Object[] obj={"Ja","Nein"};
                ImageIcon icon = new ImageIcon("jaNein");
                Object antwort = JOptionPane.showInputDialog(null, "Wollen Sie den Raum '" + raum +  "' buchen?", "Eingabefenster",
                        JOptionPane.INFORMATION_MESSAGE, icon, obj,"");
                if (antwort.equals("Ja")) {
                    ausgabe = "Sie haben den Raum '" + raum + "' erfolgreich gebucht";
                    raum.setVerfuegbarkeit(false);
                    raumDatenbank.speicherBelegtenRaum(raum);
                    raumDatenbank.entferneVerfuegbarenRaum(raum);
                    meineBuchungen.add(raum);
                } else if (antwort.equals("Nein")) {
                    ausgabe = "Der Raum '" + raum +  "' wurde nicht gebucht";
                }


            } else if (!raum.getVerfuegbarkeit()) {
                ausgabe = "Der Raum '" + raum + "' ist nicht verfügbar.";
            }
            return ausgabe;
        }


    // (1)Benutzer storniert Raum (2)Verfügbarkeit wird geändert (3)Raum von meineBuchungen gelöscht
    @Override
    public String storniereRaum(Raum raum) {
        String ausgabe = "";
        if (!raum.getVerfuegbarkeit()) {
            raum.setVerfuegbarkeit(true);
            meineBuchungen.remove(raum);
            raumDatenbank.speicherVerfuegbarenRaum(raum);
            raumDatenbank.entferneBelegtenRaum(raum);
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
        String ausgabe;
        ausgabe = "Verf�gbaren Raeume: " + raumDatenbank.ladeVerfuegbareRaeume();
        return ausgabe;
    }

 */

    public ArrayList<Raum> getMeineBuchungen() {
        return meineBuchungen;
    }

    public String getName() {
        return name;
    }

    public static void fuegeBuchungHinzu(Raum raum) {
        meineBuchungen.add(raum);
    }

    public static void erstelleNeuenBenutzer( String name, String passwort) {
       // neues Objekt erstellen
        Benutzer neuerBenutzer = new Benutzer(name, passwort);
        alleBenutzer.add(neuerBenutzer);
    }
    //ToDo: Methode die den Namen des Objekts ausgibt um zu vergleichen
    public static String gibDenNamenDesElementsHer(Benutzer benutzer) {
     for (int i = 0; i < alleBenutzer.size(); i++) {
         if (alleBenutzer.get(i) == alleBenutzer)
     }
        return null;
    }
}

